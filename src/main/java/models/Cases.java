package models;

public class Cases {
    private int caseid;
    private int countyid;
    private String countystatus;
    private int id;

    public Cases(int caseid, int countyid, String countystatus) {
        this.caseid = caseid;
        this.countyid = countyid;
    }

    public int getCaseId() {
        return caseid;
    }

    public int getCountyId() {
        return countyid;
    }

    public String getCountyStatus() {
        return countystatus;
    }
}
