/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Baza;

import Dane.Dane;
import Komponenty.FastTest;
import Komponenty.Grupa;
import Komponenty.TestGetter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
public class KontoStudentaTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Parameterized.Parameter(value = 0)
    public KontoStudenta kontoStudenta;
    
    @Parameterized.Parameter(value = 1)
    public String[] expectedToString;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{Dane.ZestawKontStudenta[0], Dane.KontoStudentaExpectedResults[0]}, {Dane.ZestawKontStudenta[1], Dane.KontoStudentaExpectedResults[1]}};
        return Arrays.asList(data1);
    }

    /**
     * Test of getListaGrup method, of class KontoStudenta.
     */
    @Category({TestGetter.class, FastTest.class})
    @Test
    public void testGetListaGrup() {
        System.out.println("getListaGrup");
        /*KontoStudenta instance = new KontoStudenta();
        List<Grupa> expResult = null;
        List<Grupa> result = instance.getListaGrup();
        assertEquals(expResult, result);*/
        for(int i=0;i<Dane.ZestawKontStudenta.length;i++){
            assertEquals(kontoStudenta.getListaGrup().get(i).toString(), expectedToString[i]);
        }
    }
    
}
