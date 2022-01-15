/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Aplikacja;

import Baza.Katalog;
import Dane.Dane;
import Komponenty.Grupa;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized;

/**
 *
 * @author Qucker135
 */
public class Aplikacja_studentaTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Parameterized.Parameter(value = 0)
    public String answer;
    
    @Parameterized.Parameter(value = 1)
    public boolean expectedReaction;
    
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{Dane.AplikacjaStudentaPobierzChecWypisuData[0], Dane.AplikacjaStudentaExpectedResults[0]}, {Dane.AplikacjaStudentaPobierzChecWypisuData[1], Dane.AplikacjaStudentaExpectedResults[1]}};
        return Arrays.asList(data1);
    }
    
    @Test
    public void testpobierzChecWypisu(){
        Aplikacja_studenta as = new Aplikacja_studenta();
        for(int i=0; i<Dane.AplikacjaStudentaPobierzChecWypisuData.length; i++){
            answer = Dane.AplikacjaStudentaPobierzChecWypisuData[i];
            expectedReaction = Dane.AplikacjaStudentaExpectedResults[i];
            assertEquals(as.pobierzChecWypisu(answer), expectedReaction);
        }  
    }
    
    @Test
    public void testPobierzGrupe(){
        Aplikacja_studenta as = new Aplikacja_studenta();
        assertEquals(as.pobierzGrupe(Dane.l1, "a"), Dane.g1);
        assertEquals(as.pobierzGrupe(Dane.l1, "d"), Dane.g2);
        assertEquals(as.pobierzGrupe(Dane.l1, "b"), null);
        assertEquals(as.pobierzGrupe(Dane.l2, "p"), Dane.g3);
        assertEquals(as.pobierzGrupe(Dane.l2, "x"), Dane.g4);
        assertEquals(as.pobierzGrupe(Dane.l2, "c"), null);
    }
    
}
