package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasesTest {
    @Test
    public void casesInstantiatesCorrectly() {
        Cases cases = new Cases (1, 47, "Lockdown");
        assertEquals(true, cases instanceof Cases);
    }

    @Test
    public void getCaseId() {
        Cases cases = new Cases (1, 47, "Lockdown");
        assertEquals(1, cases.getCaseId());
    }

    @Test
    public void getCountyId() {
        Cases cases = new Cases (1, 47, "Lockdown");
        assertEquals(47, cases.getCountyId());
    }

    @Test
    public void getCountyStatus() {
        Cases cases = new Cases (1, 47, "Lockdown");
        assertEquals("Lockdown", cases.getCountyStatus());
    }
}