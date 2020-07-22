package models;

import java.util.Objects;

public class Cases {
    private int caseid;
    private int countyid;
    private String countystatus;
    private int id;

    public Cases(int caseid, int countyid, String countystatus) {
        this.caseid = caseid;
        this.countyid = countyid;
        this.countystatus = countystatus;
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

    public void setCaseId(int caseid) {
        this.caseid = caseid;
    }

    public void setCountyId(int countyid) {
        this.countyid = countyid;
    }

    public void setCountyStatus(String countystatus) {
        this.countystatus = countystatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cases)) return false;
        Cases cases = (Cases) o;
        return caseid == cases.caseid &&
                countyid == cases.countyid &&
                id == cases.id &&
                Objects.equals(countystatus, cases.countystatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseid, countyid, countystatus, id);
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}
