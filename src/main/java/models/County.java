package models;

import java.util.Objects;

public class County {
    private String county;
    private int totalcases;
    private int newcases;
    private int totaldeaths;
    private int newdeaths;
    private int totalrecoveries;
    private int newrecoveries;
    private int activecases;
    private int id;

    public County(String county, int totalcases, int newcases, int totaldeaths, int newdeaths, int totalrecoveries, int newrecoveries, int activecases) {
        this.county = county;
        this.totalcases = totalcases;
        this.newcases = newcases;
        this.totaldeaths = totaldeaths;
        this.newdeaths = newdeaths;
        this.totalrecoveries = totalrecoveries;
        this.newrecoveries = newrecoveries;
        this.activecases = activecases;
    }

    public String getCounty() {
        return county;
    }

    public int getTotalCases() {
        return totalcases;
    }

    public int getNewCases() {
        return newcases;
    }

    public int getTotalDeaths() {
        return totaldeaths;
    }

    public int getNewDeaths() {
        return newdeaths;
    }

    public int getTotalRecoveries() {
        return totalrecoveries;
    }

    public int getNewRecoveries() {
        return newrecoveries;
    }

    public int getActiveCases() {
        return activecases;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setTotalCases(int totalcases) {
        this.totalcases = totalcases;
    }

    public void setNewCases(int newcases) {
        this.newcases = newcases;
    }

    public void setTotalDeaths(int totaldeaths) {
        this.totaldeaths = totaldeaths;
    }

    public void setNewDeaths(int newdeaths) {
        this.newdeaths = newdeaths;
    }

    public void setTotalRecoveries(int totalrecoveries) {
        this.totalrecoveries = totalrecoveries;
    }

    public void setNewRecoveries(int newrecoveries) {
        this.newrecoveries = newrecoveries;
    }

    public void setActiveCases(int activecases) {
        this.activecases = activecases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof County)) return false;
        County that = (County) o;
        return totalcases == that.totalcases &&
                newcases == that.newcases &&
                totaldeaths == that.totaldeaths &&
                newdeaths == that.newdeaths &&
                totalrecoveries == that.totalrecoveries &&
                newrecoveries == that.newrecoveries &&
                activecases == that.activecases &&
                Objects.equals(county, that.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(county, totalcases, newcases, totaldeaths, newdeaths, totalrecoveries, newrecoveries, activecases);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
