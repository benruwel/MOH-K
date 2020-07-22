package dao;

import models.Cases;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;

public class Sql2oCasesDao implements CasesDao{
    private Sql2o sql2o;
    public Sql2oCasesDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void addCase(Cases cases) {
        String sql = "INSERT INTO cases(county_id, caseStatus) VALUES (:county_id, :caseStatus)";
        try (Connection con = sql2o.open()){
            int id =(int)con.createQuery(sql,true).bind(cases).executeUpdate().getKey();
            cases.setId(id);
        }
        catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public List<Cases> getAllCases() {
        String sql = "SELECT * FROM cases";
        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Cases.class);
        }
    }

    public  List<Cases> getAllActiveCases(){
        String sql = "SELECT * FROM cases WHERE caseStatus ='Active' ";
        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Cases.class);
        }
    }

    public  List<Cases> getAllDeathCases(){
        String sql = "SELECT * FROM cases WHERE caseStatus ='Dead' ";
        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Cases.class);
        }
    }

    public  List<Cases> getAllRecoveredCases(){
        String sql = "SELECT * FROM cases WHERE caseStatus ='Recovered' ";
        try(Connection con = sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Cases.class);
        }
    }

    @Override
    public Cases findCaseById(int id) {
        String sql = "SELECT * FROM cases WHERE id = :id";
        try(Connection con= sql2o.open()) {
            return con.createQuery(sql).executeAndFetchFirst(Cases.class);
        }
    }
}
