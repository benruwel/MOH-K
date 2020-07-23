package dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

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

}