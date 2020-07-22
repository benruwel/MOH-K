package models;

import java.util.Objects;

public class Cases {
    private int id;
    private String name;
    private int county_id;
    private String TYPE_OF_CASE;

    public Cases(String name, int county_id, String caseStatus) {
        this.name = name;
        this.county_id = county_id;
        this.TYPE_OF_CASE = caseStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCounty_id() {
        return county_id;
    }

    public void setCounty_id(int county_id) {
        this.county_id = county_id;
    }

    public String getTYPE_OF_CASE() {
        return TYPE_OF_CASE;
    }

    public void setTYPE_OF_CASE(String TYPE_OF_CASE) {
        this.TYPE_OF_CASE = TYPE_OF_CASE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cases cases = (Cases) o;
        return id == cases.id &&
                county_id == cases.county_id &&
                name.equals(cases.name) &&
                TYPE_OF_CASE.equals(cases.TYPE_OF_CASE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, county_id, TYPE_OF_CASE);
    }
}
