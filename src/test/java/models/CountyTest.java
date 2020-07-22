package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountyTest {
    @Test
    public void countyInstantiatesCorrectly() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals(true, county instanceof County);
    }

    @Test
    public void getCountyName() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals("Nairobi", county.getCounty());
    }

}