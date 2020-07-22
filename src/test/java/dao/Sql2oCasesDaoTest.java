package dao;

import org.junit.Before;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class Sql2oCasesDaoTest {
    private Connection conn;
    private Sql2oCasesDao casesDao;
    private Sql2oCountyDao countyDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        casesDao = new Sql2oCasesDao(sql2o);
        countyDao = new Sql2oCountyDao(sql2o);
        conn = sql2o.open();
    }

}