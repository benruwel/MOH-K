package models;

import java.util.Objects;

public class County {
    private int id;
    private String countyName;
    private int countyPopulation;
    private int countyCode;
    private int totalCases;
    private int deathCases;
    private int recoveredCases;
    private int activeCases;

    public County(String countyName, int countyPopulation, int countyCode, int totalCases, int deathCases, int recoveredCases, int activeCases) {
        this.countyName = countyName;
        this.countyPopulation = countyPopulation;
        this.countyCode = countyCode;
        this.totalCases = totalCases;
        this.deathCases = deathCases;
        this.recoveredCases = recoveredCases;
        this.activeCases = activeCases;
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

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public int getDeathCases() {
        return deathCases;
    }

    public void setDeathCases(int deathCases) {
        this.deathCases = deathCases;
    }

    public int getRecoveredCases() {
        return recoveredCases;
    }

    public void setRecoveredCases(int recoveredCases) {
        this.recoveredCases = recoveredCases;
    }


    public int getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        County county = (County) o;
        return id == county.id &&
                countyPopulation == county.countyPopulation &&
                countyCode == county.countyCode &&
                totalCases == county.totalCases &&
                deathCases == county.deathCases &&
                recoveredCases == county.recoveredCases &&
                activeCases == county.activeCases &&
                countyName.equals(county.countyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countyName, countyPopulation, countyCode, totalCases, deathCases, recoveredCases, activeCases);
    }
}
