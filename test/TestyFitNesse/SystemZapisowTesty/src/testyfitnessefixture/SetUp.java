/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testyfitnessefixture;
import fit.Fixture;
import Aplikacja.Aplikacja_studenta;
import Baza.Katalog;
import Komponenty.Grupa;
import java.util.ArrayList;

public class SetUp extends Fixture{
   static Aplikacja_studenta aplikacja_studenta;
   static Katalog katalog;

   public SetUp() {
       aplikacja_studenta = new Aplikacja_studenta();
       katalog = new Katalog(); //potrzebne do testu sprawdzZapis()
       ArrayList<Grupa> listaGrup = new ArrayList<Grupa>();
       listaGrup.add(new Grupa("1", "2", "Kowalski"));
       listaGrup.add(new Grupa("3", "4", "Nowak"));
       listaGrup.add(new Grupa("5", "6", "Smith"));
       katalog.setListaGrup(listaGrup);
   }
}
