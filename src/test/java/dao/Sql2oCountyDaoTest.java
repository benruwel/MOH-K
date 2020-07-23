package dao;

import models.County;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.assertEquals;

public class Sql2oCountyDaoTest {
    private Connection conn;
    private Sql2oCountyDao CountyDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        CountyDao = new Sql2oCountyDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingCountySetsId() throws Exception {
        County testCounty = setupCounty();
        assertEquals(0,testCounty.getId());
    }

    @Test
    public void getAll() throws Exception {
        County county1 = setupCounty();
        County county2 = setupCounty();
        assertEquals(2,CountyDao.getAllCounties().size());
    }

    @Test
    public void casesAreReturnedCorrectly() throws Exception {

    }
    //helpers
    public County setupCounty() {
        County county = new County("Nairobi", 4397000, 047, 6245, 56, 364, 5825);
        CountyDao.add(county);
        return county;
    }


}