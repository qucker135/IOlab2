/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Komponenty;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import Dane.Dane;

/**
 *
 * @author Qucker135
 */
public class GrupaTest {
    
    public GrupaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Grupa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //Grupa instance = new Grupa("23");
        //String expResult = Dane.GrupatoStringTestResult[0];
        //String result = instance.toString();
        //assertEquals(expResult, result);
        for(int i=0; i<Dane.GrupatoStringTestGrupy.length; i++){
            assertEquals(Dane.GrupatoStringTestGrupy[i].toString(), Dane.GrupatoStringTestResult[i]);
        }
        //assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
