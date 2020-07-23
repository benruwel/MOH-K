package dao;

import models.County;

import java.util.List;

public interface CountyDao {
    //Create
    void add (County county);

    //Read
    List<County> getAllCounties();

    County findCountyById(int id);

    //Update
    void update (int id);

}
