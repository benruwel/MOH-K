package models;

public class ActiveCases extends Cases {
    private String TYPE_OF_CASE= "Active";

    public ActiveCases(String name, int county_id, String caseStatus) {
        super(name, county_id, caseStatus);
        this.TYPE_OF_CASE=caseStatus;
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
