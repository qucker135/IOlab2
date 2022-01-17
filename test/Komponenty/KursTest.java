/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Komponenty;

import Dane.Dane;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Sakue
 */
@RunWith(Parameterized.class)
public class KursTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Parameterized.Parameter(value = 0)
    public String kodKursu;
    @Parameterized.Parameter(value = 1)
    public String nazwa;
    
    @Parameterized.Parameter(value = 2)
    public String expectedResult;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{Dane.KursToStringDaneTestowe[0], Dane.KursToStringDaneTestowe[1]};
        return Arrays.asList(data1);
    }
    
    /**
     * Test of toString method, of class Kurs.
     */
    @Category(FastTest.class)
    @Test
    public void testToString() {
        System.out.println("toString");
        //Kurs instance = new Kurs("1", "Matematyka dyskretna");
        //String expResult = "[\n\tkodKursu: 1\n\tNazwa: Matematyka dyskretna\n\tForma: {}\n\tJezyk: Angielski\n]";
        //String result = instance.toString();
        //assertEquals(expResult, result);
        assertEquals(new Kurs(kodKursu, nazwa).toString(), expectedResult);
    }
    
}
