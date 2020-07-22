package models;

public class County {
    private String county;
    private int totalcases;
    private int newcases;
    private int totaldeaths;
    private int newdeaths;
    private int totalrecoveries;
    private int newrecoveries;
    private int activecases;

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
}
