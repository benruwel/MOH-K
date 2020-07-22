package dao;

import models.Cases;
import models.County;

import java.util.List;

public interface CountyDao {
    //Create
    void add (County county);
    // void addCountyCases(Cases cases,Counties counties);

    //Update

    void update(County county);

    //Read
    List<County> getAllCounties();
    List<Cases> getAllCasesInCounties(int id);
    County findCountyById(int id);

}
