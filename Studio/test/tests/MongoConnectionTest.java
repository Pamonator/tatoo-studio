/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import dabatase.Mongodb;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MongoConnectionTest {

    public MongoConnectionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        Mongodb mongo = new Mongodb();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConnection() {

        Mongodb mongo = new Mongodb();
        assertTrue(mongo.connect());
        
    }

}
