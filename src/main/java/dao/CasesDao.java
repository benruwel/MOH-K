package dao;

import models.Cases;

import java.util.List;

public interface CasesDao {
    //Create
    void addCase(Cases cases);

    //Read
    List<Cases> getAllCases();
    Cases findCaseById(int id);
}
