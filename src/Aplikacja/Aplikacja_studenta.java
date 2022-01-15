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
		zapisz(wlasneKonto.getListaGrup(), new Grupa("0"));
		zapisz(wlasneKonto.getListaGrup(), new Grupa("1"));
		zapisz(wlasneKonto.getListaGrup(), new Grupa("2"));
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

		//TEST
		wyswietlListeGrup(listaGrup);
		return listaGrup;
	}

	private boolean pobierzChecWypisu() {
		System.out.println("Czy chcesz wypisac sie z grupy? [t/n]:");
		Scanner scanner = new Scanner(System.in);
		String ch = scanner.nextLine();
		if (ch.equals("t")) //PYTANIE
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

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Aplikacja_studenta aplikacja_studenta = new Aplikacja_studenta();
		aplikacja_studenta.sprawdzenie();
	}

}