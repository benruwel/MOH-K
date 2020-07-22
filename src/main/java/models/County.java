package models;

public class County {
    private String county;

    public County(String county, int totalcases, int newcases, int totaldeaths, int newdeaths, int totalrecoveries, int newrecoveries, int activecases) {
        this.county = county;
    }

    public String getCounty() {
        return county;
    }
}
