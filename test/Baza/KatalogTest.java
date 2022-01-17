/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Baza;

import Dane.Dane;
import Komponenty.Grupa;
import Komponenty.FastTest;
import Komponenty.SlowTest;
import Komponenty.TestGetter;
import java.util.ArrayList;
//import Komponenty.Kurs;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.experimental.categories.Category;

/**
 *
 * @author Qucker135
 */
@RunWith(Parameterized.class)
public class KatalogTest {
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Parameterized.Parameter(value = 0)
    //public Grupa grupa;
    public Katalog katalog;
    
    @Parameterized.Parameter(value = 1)
    public String[] expectedToString;
    
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{Dane.ZestawKatalogow[0], Dane.KatalogExpectedResults[0]}, {Dane.ZestawKatalogow[1], Dane.KatalogExpectedResults[1]}};
        return Arrays.asList(data1);
    }
    /**
     * Test of getListaGrup method, of class Katalog.
     */
    @Category({TestGetter.class, FastTest.class})
    @Test
    public void testGetListaGrup() {
        System.out.println("getListaGrup");
        //List<Grupa> listaGrup = katalog.getListaGrup();
        //assertEquals(katalog, null); //nie wiadomo dlaczego, prawdopodobnie dlatego, że obiekty przekazywane są przez "wskaznik" (adres, w javie nie ma wskaznikow)
        for(int i=0;i<Dane.ZestawKatalogow.length;i++){
            assertEquals(katalog.getListaGrup().get(i).toString(), expectedToString[i]);
        }
        /* zapomnialem w tym momencie o adnotacji @RunWith(Parameterized.class)
        for(int i=0;i<Dane.ZestawKatalogow.length;i++){
            katalog = Dane.ZestawKatalogow[i];
            expectedToString = Dane.KatalogExpectedResults[i];
            List<Grupa> listaGrup = katalog.getListaGrup();
            assertEquals(listaGrup.size(), expectedToString.length);
            //System.out.println(listaGrup.size());
            for(int j=0; j<listaGrup.size();j++){
                assertEquals(listaGrup.get(j).toString(),expectedToString[j]);
            }
        }*/
    }
}
