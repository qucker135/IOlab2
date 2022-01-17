/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baza;

import Dane.Dane;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import mockit.Capturing;
import mockit.Expectations;
import mockit.Verifications;

import java.util.*;
import Komponenty.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Sakue
 */
@RunWith(JMockit.class)
public class KontoStudentaTest2 {
    @Injectable
    private List<Grupa> listaGrup;

    @Tested
    private KontoStudenta kontoStudenta;
    
    @Test
    public void testZapisz() {
        new Expectations() {{
            
        }};
        
        assertEquals(kontoStudenta.getListaGrup(), listaGrup);
        
        new Verifications() {{
            
        }};
    }
}
