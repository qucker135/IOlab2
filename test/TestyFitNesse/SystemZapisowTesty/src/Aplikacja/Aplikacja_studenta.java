package Aplikacja;

import Baza.*;
import Komponenty.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplikacja_studenta {

	private KontoStudenta wlasneKonto;

	public Aplikacja_studenta() {
		wlasneKonto = new KontoStudenta();
		zapisz(wlasneKonto.getListaGrup(), new Grupa("0", "0a", "Kowalski"));
		zapisz(wlasneKonto.getListaGrup(), new Grupa("1", "1b", "Nowak"));
		zapisz(wlasneKonto.getListaGrup(), new Grupa("2", "2c", "Smith"));
	}

        public Grupa podajDaneGrupy(String kodGrupy, String kodKursu, String prowadzacy){
		return new Grupa(kodGrupy, kodKursu, prowadzacy);
	}
        
        public Kurs wykonajKurs(String kodKursu, String nazwa){
		return new Kurs(kodKursu, nazwa);
	}
        
        public KontoStudenta getWlasneKonto(){
            return wlasneKonto;
        }
        
	/**
	 * 
	 * @param grupa
	 */
	public void zapisz(List<Grupa> listaGrup, Grupa grupa) {
		if (grupa != null)
			listaGrup.add(grupa);
                
	}
	
	/**
	 * 
	 * @param listaGrup
	 */
	private void wyswietlListeGrup(List<Grupa> listaGrup) {
		for (Grupa grupa : listaGrup) {
			System.out.println(grupa.toString());
		}
	}

	/**
	 * 
	 * @param grupa
	 */
	public void wypisz(List<Grupa> listaGrup, Grupa grupa) {
		if (grupa != null) {
			listaGrup.remove(grupa);
		}
	}

	public List<Grupa> sprawdzenie() {
		List<Grupa> listaGrup = wlasneKonto.getListaGrup();
		wyswietlListeGrup(listaGrup); //PYTANIE
		
		if(pobierzChecWypisu() == true) {
			Grupa grupa = pobierzGrupe(listaGrup);
			wypisz(listaGrup, grupa);
		}
                wlasneKonto.setListaGrup(listaGrup);

		//TEST
		wyswietlListeGrup(listaGrup);
		return listaGrup;
	}
        
        public boolean sprawdzenie(String znak, String kodGrupy) {
		List<Grupa> listaGrup = wlasneKonto.getListaGrup();
		
                boolean chec = pobierzChecWypisu(znak);
                
		if(chec) {
			Grupa grupa = pobierzGrupe(listaGrup, kodGrupy);
			wypisz(listaGrup, grupa);
		}
                wlasneKonto.setListaGrup(listaGrup);
                
                return chec;
	}
        
        public boolean sprawdzZapis(String znak, String kodGrupy, Katalog katalog) {
		List<Grupa> listaGrup = wlasneKonto.getListaGrup();
		
                boolean chec = pobierzChecZapisu(znak);
                
		if(chec) {
			Grupa grupa = katalog.pobierzGrupe(kodGrupy);
			zapisz(listaGrup, grupa);
		}
                wlasneKonto.setListaGrup(listaGrup);
                
                return chec;
	}
        

	public boolean pobierzChecWypisu() {
		System.out.println("Czy chcesz wypisac sie z grupy? [t/n]:");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.nextLine();
		//String ch = znak;
                if (ch.equals("t"))
			return true;
		
		return false;
	}
        
        public boolean pobierzChecWypisu(String znak) {
		System.out.println("Czy chcesz wypisac sie z grupy? [t/n]:");
		//Scanner scanner = new Scanner(System.in);
		//String ch = scanner.nextLine();
		String ch = znak;
                if (ch.equals("t"))
			return true;
		
		return false;
	}
        
        public boolean pobierzChecZapisu(String znak) {
		System.out.println("Czy chcesz wypisac sie z grupy? [t/n]:");
		//Scanner scanner = new Scanner(System.in);
		//String ch = scanner.nextLine();
		String ch = znak;
                if (ch.equals("t"))
			return true;
		
		return false;
	}

	private Grupa pobierzGrupe(List<Grupa> listaGrup) { //PYTANIE
		System.out.println("Podaj kod grupy:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		for (Grupa grupa : listaGrup) {
			if (grupa.getKodGrupy().equals(str))
				return grupa;
		}
		return null;
	}
        
        public Grupa pobierzGrupe(List<Grupa> listaGrup, String kodGrupy) { //PYTANIE
		System.out.println("Podaj kod grupy:");
		/*
                Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		*/
		for (Grupa grupa : listaGrup) {
			if (grupa.getKodGrupy().equals(kodGrupy))
				return grupa;
		}
		return null;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Aplikacja_studenta aplikacja_studenta = new Aplikacja_studenta();
		aplikacja_studenta.sprawdzenie();
	}

}