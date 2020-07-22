package models;

public class DeathCases extends Cases {
    private String TYPE_OF_CASE= "Dead";

    public DeathCases(String name, int county_id, String caseStatus) {
        super(name, county_id, caseStatus);
        this.TYPE_OF_CASE =caseStatus;
    }

    @Override
    public String getTYPE_OF_CASE() {
        return TYPE_OF_CASE;
    }

    @Override
    public void setTYPE_OF_CASE(String TYPE_OF_CASE) {
        this.TYPE_OF_CASE = TYPE_OF_CASE;
    }
}
