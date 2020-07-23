package dao;

import models.County;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;

public class Sql2oCountyDao implements CountyDao {

    private Sql2o sql2o;

    public Sql2oCountyDao (Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(County counties) {
        String sql = "INSERT INTO counties (county_name, county_code, county_population, total_cases, active_cases, recovered_cases, death_cases) VALUES (:county_name, :county_code, :county_population, :total_cases, :active_cases, :recovered_cases, :death_cases)";
        try(Connection con =sql2o.open()) {
            int id = (int)con.createQuery(sql,true).bind(counties).executeUpdate().getKey();
            counties.setId(id);
        }
        catch (Sql2oException ex){
            System.out.println(ex);

        }
    }

    @Override
    public List<County> getAllCounties() {
        String sql = "SELECT * FROM counties";
        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(County.class);
        }

    }

    @Override
    public County findCountyById(int id) {
        String sql = "SELECT * FROM counties WHERE id = :id";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(County.class);
        }

    }

    public County findByIdHighestAffectedCounty(int id){
        String sql = "SELECT MAX(totalCases) from counties";
        try(Connection con= sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(County.class) ;
        }
    }
    public County findByIdMinimumAffectedCounty(int id){
        String sql = "SELECT MIN(totalCases) from counties";
        try(Connection con= sql2o.open()) {
            return con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(County.class) ;
        }
    }

    @Override
    public void update(int id) {
        String sql = "UPDATE counties SET county_code = :county_code WHERE id =:id";
        try(Connection con = sql2o.open()) {
             con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }
}
