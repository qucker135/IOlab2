/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dane;

import Komponenty.*;
import Baza.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Qucker135
 */

public class Dane {
    //public static final Grupa[]  GrupatoStringTestGrupy  = {new Grupa("1"), new Grupa("2ab"), new Grupa("xyz")};
    public static final String[][] GrupatoStringDaneTestowe = {{"1", "0", "Kowalski", "[\n\tkodGrupy: 1\n\tkodKursu: 0\n\tForma: Wyklad\n\tNazwisko prowadzacego: Kowalski\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"}, {"2ab", "8ac", "Nowak", "[\n\tkodGrupy: 2ab\n\tkodKursu: 8ac\n\tForma: Wyklad\n\tNazwisko prowadzacego: Nowak\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"}, {"9", "3d", "Smith", "[\n\tkodGrupy: 9\n\tkodKursu: 3d\n\tForma: Wyklad\n\tNazwisko prowadzacego: Smith\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"}};
    //public static final String[] GrupatoStringTestResult = {};
    
    public static final String[][] KursToStringDaneTestowe = {{"1", "Matematyka dyskretna", "[\n\tkodKursu: 1\n\tNazwa: Matematyka dyskretna\n\tForma: {}\n\tJezyk: Angielski\n]"}, {"2ab", "Analiza matematyczna", "[\n\tkodKursu: 2ab\n\tNazwa: Analiza matematyczna\n\tForma: {}\n\tJezyk: Angielski\n]"}};
    
    //public static final ArrayList<Grupa>[] KatalogGetListaGrupDaneTestowe = new ArrayList[5];
    
    //public Katalog k1 = new Katalog(new ArrayList<Grupa>(List.of(new Grupa("","",""), new Grupa("","",""))));
    public static final Grupa g1 = new Grupa("a","b","c");
    public static final Grupa g2 = new Grupa("d","e","f");
    public static final ArrayList<Grupa> l1 = new ArrayList<Grupa>(Arrays.asList(g1, g2));
    public static final Katalog k1 = new Katalog(l1);
    public static final Grupa g3 = new Grupa("p","q","r");
    public static final Grupa g4 = new Grupa("x","y","z");
    public static final ArrayList<Grupa> l2 = new ArrayList<Grupa>(Arrays.asList(g3, g4)); 
    public static final Katalog k2 = new Katalog(l2);
    public static final Katalog[] ZestawKatalogow = {k1, k2};
    //public static final ArrayList<Grupa>[] listaListGrup = {new ArrayList<Grupa>(List.of(new Grupa("a","b","c"), new Grupa("d","e","f"))), new ArrayList<Grupa>(List.of(new Grupa("p","q","r"), new Grupa("x","y","z")))};
    public static final String[][] KatalogExpectedResults = {{"[\n\tkodGrupy: a\n\tkodKursu: b\n\tForma: Wyklad\n\tNazwisko prowadzacego: c\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]","[\n\tkodGrupy: d\n\tkodKursu: e\n\tForma: Wyklad\n\tNazwisko prowadzacego: f\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"},{"[\n\tkodGrupy: p\n\tkodKursu: q\n\tForma: Wyklad\n\tNazwisko prowadzacego: r\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]","[\n\tkodGrupy: x\n\tkodKursu: y\n\tForma: Wyklad\n\tNazwisko prowadzacego: z\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"}};
    
    public static final KontoStudenta ks1 = new KontoStudenta(l1);
    public static final KontoStudenta ks2 = new KontoStudenta(l2);
    public static final KontoStudenta[] ZestawKontStudenta = {ks1, ks2};
    public static final String[][] KontoStudentaExpectedResults = {{"[\n\tkodGrupy: a\n\tkodKursu: b\n\tForma: Wyklad\n\tNazwisko prowadzacego: c\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]","[\n\tkodGrupy: d\n\tkodKursu: e\n\tForma: Wyklad\n\tNazwisko prowadzacego: f\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"},{"[\n\tkodGrupy: p\n\tkodKursu: q\n\tForma: Wyklad\n\tNazwisko prowadzacego: r\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]","[\n\tkodGrupy: x\n\tkodKursu: y\n\tForma: Wyklad\n\tNazwisko prowadzacego: z\n\tTermin: Poniedziałek 9:15\n\tNumer budynku: C4\n\tSala: 205\n\tLiczba zapisanych: 26\n\tMaksymalna liczba zapisanych: 30\n]"}};
    
    public static final String AplikacjaStudentaPobierzChecWypisuData[] = {"t", "n"};
    public static final boolean AplikacjaStudentaExpectedResults[] = {true, false};
    
    public static final String AplikacjaStudentTestingIndexes[] = {"a", "p"};
    //public static final Grupa AplikacjaStudentaTestingGroups[] = {g1, g3};
    
    //public List<Grupa> listaGrup1 = new ArrayList<Grupa>();
    //public Grupa grupa1 = new Grupa("", "", "");
    //listaGrup1.add(grupa1);
    //listaGrup1.add(grupa1);
    //public static final Object[][] KataloggetListaGrup;
}
