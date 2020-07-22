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

    @Test
    public void getTotalCases() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals(13771, county.getTotalCases());
    }

    @Test
    public void getNewCases() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals(540, county.getNewCases());
    }

    @Test
    public void getTotalDeaths() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals(238, county.getTotalDeaths());
    }

    @Test
    public void getNewDeaths() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals(68, county.getNewDeaths());
    }

    @Test
    public void getTotalRecoveries() {
        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
        assertEquals(5616, county.getTotalRecoveries());
    }

}