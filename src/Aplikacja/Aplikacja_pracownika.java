package Aplikacja;

import Baza.*;
import Komponenty.*;

import java.util.List;
import java.util.ArrayList;
//import org.junit.JUnit;

public class Aplikacja_pracownika {

	private Katalog katalogKursow = new Katalog();

	/**
	 * 
	 * @param grupa
	 */
	public void dodajGrupe(Grupa grupa) {
		if(grupa != null){
			List<Grupa> listaGrup = katalogKursow.getListaGrup();
			listaGrup.add(grupa);
			katalogKursow.setListaGrup(listaGrup);
		}
	}

	/**
	 * 
	 * @param grupa
	 */
	public void usunGrupe(List<KontoStudenta> listaKont, Grupa grupa) {
		if(grupa != null){
			for(KontoStudenta kontoStudenta : listaKont) {
				List<Grupa> listaGrup = kontoStudenta.getListaGrup();
				listaGrup.remove(grupa);
				kontoStudenta.setListaGrup(listaGrup);
			}
			List<Grupa> listaGrup = katalogKursow.getListaGrup();
			listaGrup.remove(grupa);
			katalogKursow.setListaGrup(listaGrup);
		}
	}

	/**
	 * 
	 * @param grupa
	 * @param atrybut
	 * @param nowaWartosc
	 */
	public void zmodyfikujGrupe(Grupa grupa, String atrybut, String nowaWartosc) {
		// TODO - implement Aplikacja_pracownika.zmodyfikujGrupe
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param kurs
	 */
	public void dodajKurs(Kurs kurs) {
		if(kurs != null){
			List<Kurs> listaKursow = katalogKursow.getListaKursow();
			listaKursow.add(kurs);
			katalogKursow.setListaKursow(listaKursow);
		}
	}

	/**
	 * 
	 * @param kurs
	 */
	public void usunKurs(List<KontoStudenta> listaKont, Kurs kurs) {
		if(kurs != null){
			//List<Grupa> staraListaGrup = katalogKursow.getListaGrup();
			//for(Grupa grupa : katalogKursow.getListaGrup()){
			//	if(grupa.getKodKursu().equals(kurs.getKodKursu())){
			//		usunGrupe(listaKont, grupa);
			//	}
			//}
			List<Grupa> listaGrup = katalogKursow.getListaGrup();
			listaGrup.removeIf(grupa -> ( grupa.getKodKursu().equals(kurs.getKodKursu()) ));
			katalogKursow.setListaGrup(listaGrup);

			List<Kurs> listaKursow = katalogKursow.getListaKursow();
			listaKursow.remove(kurs);
			katalogKursow.setListaKursow(listaKursow);
		}
	}

	/**
	 * 
	 * @param kurs
	 * @param atrybut
	 * @param nowaWartosc
	 */
	public void zmodyfikujKurs(Kurs kurs, String atrybut, String nowaWartosc) {
		// TODO - implement Aplikacja_pracownika.zmodyfikujKurs
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO - implement Aplikacja_pracownika.main
		//throw new UnsupportedOperationException();

		Aplikacja_pracownika apk = new Aplikacja_pracownika();
		Grupa nowaGrupa = new Grupa("abc", "xyz", "Kowalski");
		apk.dodajGrupe(nowaGrupa);
		apk.dodajGrupe(new Grupa("def", "pqr", "Nowak"));
		Kurs nowykurs = new Kurs("0");
		apk.dodajKurs(nowykurs);
		System.out.println("Przed usunieciem: ");
		for(Grupa grupa : apk.katalogKursow.getListaGrup()){
			System.out.println(grupa);
		}
		for(Kurs kurs : apk.katalogKursow.getListaKursow()){
			System.out.println(kurs);
		}


		apk.usunKurs(new ArrayList<KontoStudenta>(), nowykurs);

		System.out.println("Po usunieciu: ");
		for(Grupa grupa : apk.katalogKursow.getListaGrup()){
			System.out.println(grupa);
		}
		for(Kurs kurs : apk.katalogKursow.getListaKursow()){
			System.out.println(kurs);
		}
	}

}