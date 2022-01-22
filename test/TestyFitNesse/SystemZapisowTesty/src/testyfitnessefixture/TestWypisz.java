/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testyfitnessefixture;

import fit.ColumnFixture;

import Komponenty.Grupa;
import java.util.IllegalFormatCodePointException;

/**
 *
 * @author Qucker135
 */
public class TestWypisz extends ColumnFixture{
    String dane[];
    
    public boolean Wypisz() /*throws IllegalFormatCodePointException*/{
        int s1=liczbaGrup();
        try{
            Grupa grupa = null;
            if(dane.length>=3) grupa = new Grupa(dane[0], dane[1], dane[2]);
            
            SetUp.aplikacja_studenta.wypisz(SetUp.aplikacja_studenta.getWlasneKonto().getListaGrup(), grupa);
            int s2=liczbaGrup();
            return s1!=s2;
         
        } catch(IllegalFormatCodePointException e) {
            e.printStackTrace();
        }
    return false;
    }

    
    public int liczbaGrup() {
        return SetUp.aplikacja_studenta.getWlasneKonto().getListaGrup().size();
    }
}
