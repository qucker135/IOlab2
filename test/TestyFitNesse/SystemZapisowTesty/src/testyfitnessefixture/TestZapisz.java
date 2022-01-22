/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testyfitnessefixture;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

import Komponenty.Grupa;

/**
 *
 * @author Qucker135
 */
public class TestZapisz  extends ColumnFixture{
    String dane[];
    
    public boolean Zapisz() /*throws IllegalFormatCodePointException*/{
        int s1=liczbaGrup();
        try{
            Grupa grupa = null;
            if(dane.length>=3) grupa = new Grupa(dane[0], dane[1], dane[2]);
            
            SetUp.aplikacja_studenta.zapisz(SetUp.aplikacja_studenta.getWlasneKonto().getListaGrup(), grupa);
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
