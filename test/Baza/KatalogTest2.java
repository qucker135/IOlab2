/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baza;

/**
 *
 * @author Qucker135
 */

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

@RunWith(JMockit.class)
public class KatalogTest2 {
    @Injectable
    private List<Grupa> listaGrup;
    
    @Injectable
    private List<Kurs> listaKursow;
    
    @Tested
    private Katalog katalog;
    
    @Test
    public void testGetListaGrup(){
        new Expectations(){{
        
        }};
        assertEquals(katalog.getListaGrup(), listaGrup);
        new Verifications(){{
        
        }};
    }
}
