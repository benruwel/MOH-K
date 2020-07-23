package models;

import java.util.Objects;

public class County {
    private int id;
    private String county_name;
    private int county_population;
    private int county_code;
    private int total_cases;
    private int death_cases;
    private int recovered_cases;
    private int active_cases;

    public County(String county_name, int county_population, int county_code, int total_cases, int death_cases, int recovered_cases, int active_cases) {
        this.county_name = county_name;
        this.county_population = county_population;
        this.county_code = county_code;
        this.total_cases = total_cases;
        this.death_cases = death_cases;
        this.recovered_cases = recovered_cases;
        this.active_cases = active_cases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return county_name;
    }

    public void setCountyName(String county_name) {
        this.county_name = county_name;
    }

    public int getCountyPopulation() {
        return county_population;
    }

    public void setCountyPopulation(int county_population) {
        this.county_population = county_population;
    }

    public int getCountyCode() {
        return county_code;
    }

    public void setCountyCode(int county_code) {
        this.county_code = county_code;
    }

    public int getTotalCases() {
        return total_cases;
    }

    public void setTotalCases(int total_cases) {
        this.total_cases = total_cases;
    }

    public int getDeathCases() {
        return death_cases;
    }

    public void setDeathCases(int death_cases) {
        this.death_cases = death_cases;
    }

    public int getRecoveredCases() {
        return recovered_cases;
    }

    public void setRecoveredCases(int recovered_cases) {
        this.recovered_cases = recovered_cases;
    }


    public int getActiveCases() {
        return active_cases;
    }

    public void setActiveCases(int active_cases) {
        this.active_cases = active_cases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        County county = (County) o;
        return id == county.id &&
                county_population == county.county_population &&
                county_code == county.county_code &&
                total_cases == county.total_cases &&
                death_cases == county.death_cases &&
                recovered_cases == county.recovered_cases &&
                active_cases == county.active_cases &&
                county_name.equals(county.county_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, county_name, county_population, county_code, total_cases, death_cases, recovered_cases, active_cases);
    }
}
