package models;

public class County {
    private final int newcases;
    private final int totaldeaths;
    private final int newdeaths;
    private final int totalrecoveries;
    private String county;
    private int totalcases;

    public County(String county, int totalcases, int newcases, int totaldeaths, int newdeaths, int totalrecoveries, int newrecoveries, int activecases) {
        this.county = county;
        this.totalcases = totalcases;
        this.newcases = newcases;
        this.totaldeaths = totaldeaths;
        this.newdeaths = newdeaths;
        this.totalrecoveries = totalrecoveries;
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
}
