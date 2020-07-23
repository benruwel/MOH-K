package dao;

import models.Cases;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.assertEquals;

public class Sql2oCasesDaoTest {
    private Connection conn;
    private Sql2oCasesDao CasesDao;
    private Sql2oCountyDao countyDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        CasesDao = new Sql2oCasesDao(sql2o);
        countyDao = new Sql2oCountyDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingCaseSetsId() throws Exception {
        Cases testCases = setupCases();
        assertEquals(0, testCases.getId());
    }

    @Test
    public void addedCasesAreReturnedFromGetAll() throws Exception {
        Cases testCases = setupCases();
        assertEquals(1, CasesDao.getAllCases().size());
    }

    //helpers
    public Cases setupCases() {
        Cases cases = new Cases("Nairobi", 47, "Active Cases" );
        return cases;
    }
}