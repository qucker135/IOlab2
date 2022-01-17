/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Aplikacja;

import Baza.Katalog;
import Dane.Dane;
import Komponenty.Grupa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.experimental.categories.Category;

import Komponenty.FastTest;
import Komponenty.SlowTest;
import Komponenty.TestGetter;

/**
 *
 * @author Qucker135
 */
@RunWith(Parameterized.class)
public class Aplikacja_studentaTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Parameterized.Parameter(value = 0)
    public String answer;
    
    @Parameterized.Parameter(value = 1)
    public boolean expectedReaction;
    
    @Parameterized.Parameter(value = 2)
    public ArrayList<Grupa> listToCheck;
    
    @Parameterized.Parameter(value = 3)
    public String index;
    
    @Parameterized.Parameter(value = 4)
    public Grupa foundGroup;
    
    @Parameterized.Parameter(value = 5)
    public Grupa groupToAdd;
    
    @Parameterized.Parameter(value = 6)
    public ArrayList<Grupa> groupListAfterAdding;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{Dane.AplikacjaStudentaPobierzChecWypisuData[0], Dane.AplikacjaStudentaExpectedResults[0], Dane.l1, Dane.AplikacjaStudentTestingIndexes[0], Dane.g1, Dane.g5, Dane.l3}, {Dane.AplikacjaStudentaPobierzChecWypisuData[1], Dane.AplikacjaStudentaExpectedResults[1], Dane.l2, Dane.AplikacjaStudentTestingIndexes[1], Dane.g3, Dane.g6, Dane.l4}};
        return Arrays.asList(data1);
    }
    @Category(SlowTest.class)
    @Test
    public void testpobierzChecWypisu(){
        System.out.println("pobierzChecWypisu");
        Aplikacja_studenta as = new Aplikacja_studenta();
        /*
        for(int i=0; i<Dane.AplikacjaStudentaPobierzChecWypisuData.length; i++){
            answer = Dane.AplikacjaStudentaPobierzChecWypisuData[i];
            expectedReaction = Dane.AplikacjaStudentaExpectedResults[i];
            assertEquals(as.pobierzChecWypisu(answer), expectedReaction);
        }
        */
        assertEquals(as.pobierzChecWypisu(answer), expectedReaction);
    }
    
    @Category(SlowTest.class)
    @Test
    public void testPobierzGrupe(){
        System.out.println("pobierzGrupe");
        Aplikacja_studenta as = new Aplikacja_studenta();
        assertEquals(as.pobierzGrupe(listToCheck, index), foundGroup);
        
        /*
        assertEquals(as.pobierzGrupe(Dane.l1, "a"), Dane.g1);
        assertEquals(as.pobierzGrupe(Dane.l1, "d"), Dane.g2);
        assertEquals(as.pobierzGrupe(Dane.l1, "b"), null);
        assertEquals(as.pobierzGrupe(Dane.l2, "p"), Dane.g3);
        assertEquals(as.pobierzGrupe(Dane.l2, "x"), Dane.g4);
        assertEquals(as.pobierzGrupe(Dane.l2, "c"), null);
        */
    }
    
    @Category(SlowTest.class)
    @Test
    public void testZapisz() {
        System.out.println("zapisz");
        Aplikacja_studenta as = new Aplikacja_studenta();
        ArrayList<Grupa> groupList = new ArrayList<Grupa>();
        as.zapisz(groupList, groupToAdd);
        assertEquals(groupList, groupListAfterAdding);
    }
    
}
