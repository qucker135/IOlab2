/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Komponenty;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Dane.Dane;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


/**
 *
 * @author Qucker135
 */
@RunWith(Parameterized.class)
public class GrupaTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Parameterized.Parameter
    //public Grupa grupa;
    public String kodGrupy;
    //@Parameterized.Parameter
    public String kodKursu;
    //@Parameterized.Parameter
    public String prowadzacy;
    
    //@Parameterized.Parameter
    public String expectedResult;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{Dane.GrupatoStringDaneTestowe[0], Dane.GrupatoStringDaneTestowe[1], Dane.GrupatoStringDaneTestowe[2]};
        return Arrays.asList(data1);
    }
    
    public GrupaTest(String kodGrupy, String kodKursu, String prowadzacy, String expectedResult) {
        this.kodGrupy = kodGrupy;
        this.kodKursu = kodKursu;
        this.prowadzacy = prowadzacy;
        this.expectedResult = expectedResult;
    }
    
    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    */

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
        
        //TO-REWRITE
        //for(int i=0; i<Dane.GrupatoStringTestGrupy.length; i++){
        //    assertEquals(Dane.GrupatoStringTestGrupy[i].toString(), Dane.GrupatoStringTestResult[i]);
        //}
        assertEquals(new Grupa(kodGrupy, kodKursu, prowadzacy), expectedResult);
        //assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
