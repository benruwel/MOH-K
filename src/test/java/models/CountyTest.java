//package models;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class CountyTest {
//    @Test
//    public void countyInstantiatesCorrectly() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(true, county instanceof County);
//    }
//
//    @Test
//    public void getCountyName() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals("Nairobi", county.getCounty());
//    }
//
//    @Test
//    public void getTotalCases() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(13771, county.getTotalCases());
//    }
//
//    @Test
//    public void getNewCases() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(540, county.getNewCases());
//    }
//
//    @Test
//    public void getTotalDeaths() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(238, county.getTotalDeaths());
//    }
//
//    @Test
//    public void getNewDeaths() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(68, county.getNewDeaths());
//    }
//
//    @Test
//    public void getTotalRecoveries() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(5616, county.getTotalRecoveries());
//    }
//
//    @Test
//    public void getNewRecoveries() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(18, county.getNewRecoveries());
//    }
//
//    @Test
//    public void getActiveCases() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        assertEquals(7917, county.getActiveCases());
//    }
//
//    @Test
//    public void setCountyName() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setCounty("Nairobi");
//        assertEquals("Nairobi", county.getCounty());
//    }
//
//    @Test
//    public void setTotalCases() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setTotalCases(13771);
//        assertEquals(13771, county.getTotalCases());
//    }
//
//    @Test
//    public void setNewCases() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setNewCases(540);
//        assertEquals(540, county.getNewCases());
//    }
//
//    @Test
//    public void setTotalDeaths() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setTotalDeaths(238);
//        assertEquals(238, county.getTotalDeaths());
//    }
//
//    @Test
//    public void setNewDeaths() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setNewDeaths(68);
//        assertEquals(68, county.getNewDeaths());
//    }
//
//    @Test
//    public void setTotalRecoveries() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setTotalRecoveries(5616);
//        assertEquals(5616, county.getTotalRecoveries());
//    }
//
//    @Test
//    public void setNewRecoveries() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setNewRecoveries(18);
//        assertEquals(18, county.getNewRecoveries());
//    }
//
//    @Test
//    public void setActiveCases() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setActiveCases(7917);
//        assertEquals(7917, county.getActiveCases());
//    }
//
//    @Test
//    public void setId() {
//        County county = new County("Nairobi", 13771, 540, 238, 68, 5616, 18, 7917);
//        county.setId(1);
//        assertEquals(1, county.getId());
//    }
//
//}
//
