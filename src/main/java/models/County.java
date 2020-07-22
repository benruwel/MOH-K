package models;

public class County {
    private final int newcases;
    private String county;
    private int totalcases;

    public County(String county, int totalcases, int newcases, int totaldeaths, int newdeaths, int totalrecoveries, int newrecoveries, int activecases) {
        this.county = county;
        this.totalcases = totalcases;
        this.newcases = newcases;
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
}
