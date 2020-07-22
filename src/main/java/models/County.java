package models;

import java.util.Objects;

public class County {
    private int id;
    private String countyName;
    private int countyPopulation;
    private int totalCases;
    /*private int newcases;
    private int totaldeaths;
    private int newdeaths;
    private int totalrecoveries;
    private int newrecoveries;
    private int activecases;*/


    public County(String countyName, int countyPopulation, int totalCases) {
        this.countyName = countyName;
        this.countyPopulation = countyPopulation;
        this.totalCases = totalCases;
       /* this.newcases = newcases;
        this.totaldeaths = totaldeaths;
        this.newdeaths = newdeaths;
        this.totalrecoveries = totalrecoveries;
        this.newrecoveries = newrecoveries;
        this.activecases = activecases;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyPopulation() {
        return countyPopulation;
    }

    public void setCountyPopulation(int countyPopulation) {
        this.countyPopulation = countyPopulation;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }
}
