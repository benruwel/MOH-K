package dao;

import models.Cases;
import models.County;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.ArrayList;
import java.util.List;

public class Sql2oCountyDao implements CountyDao {

    private Sql2o sql2o;

    public Sql2oCountyDao (Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(County counties) {
        String sql = "INSERT INTO counties(countyName,countyPopulation,countyCases) VALUES (:countyName,:countyPopulation,:countyCases)";
        try(Connection con =sql2o.open()) {
            int id = (int)con.createQuery(sql,true).bind(counties).executeUpdate().getKey();
            counties.setId(id);
        }
        catch (Sql2oException ex){
            System.out.println(ex);

        }
    }

    @Override
    public void update(County counties) {
        String sql = " UPDATE counties(countyName,countyPopulation,countyCases) VALUES (:countyName,:countyPopulation,:countyCases)";


    }


    /*  @Override
    public void addCountyCases(Cases cases, Counties counties) {
        try (Connection con = sql2o.open()){
            String sql = "INSERT INTO counties()";
        }

        try(Connection con=sql2o.open()) {
            String sql="INSERT INTO counties (user_id,department_id) VALUES (:user_id,:department_id)";
            con.createQuery(sql)
                    .addParameter("user_id",user.getId())
                    .addParameter("department_id",department.getId())
                    .executeUpdate();
            String sizeQuery="SELECT user_id FROM users_departments";
            List<Integer> size=con.createQuery(sizeQuery)
                    .executeAndFetch(Integer.class);
            String updateDepartmentSize="UPDATE departments SET size=:size WHERE id=:id";
            con.createQuery(updateDepartmentSize).addParameter("id",department.getId())
                    .addParameter("size",size.size())
                    .executeUpdate();

        }catch (Sql2oException e){
            System.out.println(e);
        }*/




    @Override
    public List<County> getAllCounties() {
        String sql = "SELECT * FROM counties";
        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(County.class);
        }

    }

    @Override
    public List<Cases> getAllCasesInCounties(int county_id) {
        List<Cases> cases = new ArrayList<>();
        String sql = "SELECT * FROM cases WHERE where county_id :county_id";
        try (Connection con = sql2o.open()) {
            List<Integer> casesId = con.createQuery(sql).addParameter("county_id", county_id).executeAndFetch(Integer.class);

            for (Integer id : casesId) {
                String casesResults = "SELECT * FROM cases WHERE id=:id";
                cases.add(con.createQuery(casesResults).addParameter("id", id).executeAndFetchFirst(Cases.class));

            }
            return cases;
        }
    }


    @Override
    public County findCountyById(int id) {
        String sql = "SELECT * FROM counties WHERE id = :id";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(County.class);
        }

    }
}
