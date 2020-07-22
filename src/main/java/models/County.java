package models;

public class County {
    private String county;
    private int totalcases;

    public County(String county, int totalcases, int newcases, int totaldeaths, int newdeaths, int totalrecoveries, int newrecoveries, int activecases) {
        this.county = county;
        this.totalcases = totalcases;
    }

    public String getCounty() {
        return county;
    }

    public int getTotalCases() {
        return totalcases;
    }
}
