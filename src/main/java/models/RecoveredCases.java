package models;

public class RecoveredCases extends Cases {
    private String TYPE_OF_CASE = "Recovered";

    public RecoveredCases(String name, int county_id, String caseStatus) {
        super(name, county_id, caseStatus);
        this.TYPE_OF_CASE = caseStatus;
    }

    public String getTYPE_OT_CASE() {
        return TYPE_OF_CASE;
    }

    public void setTYPE_OT_CASE(String TYPE_OF_CASE) {
        this.TYPE_OF_CASE = TYPE_OF_CASE;
    }
}
