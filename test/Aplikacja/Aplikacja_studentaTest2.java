/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplikacja;

import Baza.Katalog;
import Baza.KontoStudenta;
import Dane.Dane;
import Komponenty.Grupa;

import java.util.Scanner;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
//import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Sakue
 */
@RunWith(JMockit.class)
public class Aplikacja_studentaTest2 {
    
    @Injectable
    private KontoStudenta kontoStudenta;
    
    @Tested
    private Aplikacja_studenta aplikacja_studenta;
    
    @Test
    public void testpobierzChecWypisu() {
        new Expectations() {{
            
        }};
        
        assertEquals(aplikacja_studenta.pobierzChecWypisu("t"), true);
        
        new Verifications() {{
            
        }};
    }
        
}
