/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import projectjfr.Pemesanan;
import projectjfr.Projek;
import projectjfr.TheRefreshment;
import Logic.Methods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Lenovo
 */
public class Testing {
    
    public Testing() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    Methods met = new Methods();
    /**
     * Test of checkName method, of class Methods.
     */
    
    
     
     @Test
    public void testmasuk(){
        String username = "admin";        
        assertTrue(met.masuk(username));
    }
    @Test 
    public void testgajadi() {
    
    } 
    @Test 
    public void testalamat () {
        String addresso = "Tangerang";
        assertTrue(met.cekan(addresso));
    }
    
    @Ignore
    @Test
     public void skip() {
        String expectedResult = "admin";
        String actualResult = "admin";
        assertEquals(expectedResult, actualResult);
     }
    
         
}
