package dao;

import models.Cases;
import models.County;

import java.util.List;

public interface CountyDao {
    //Create
    void add (County county);


    //Read
    List<County> getAllCounties();
    List<Cases> getAllCasesInCounties(int id);
    County findCountyById(int id);

}
