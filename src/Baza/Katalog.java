package Baza;

import Komponenty.*;
import java.util.List;
import java.util.ArrayList;

public class Katalog {

	private List<Grupa> listaGrup = new ArrayList<Grupa>();
	private List<Kurs> listaKursow= new ArrayList<Kurs>();

	public List<Grupa> getListaGrup() {
		return this.listaGrup;
	}

	/**
	 * 
	 * @param listaGrup
	 */
	public void setListaGrup(List<Grupa> listaGrup) {
		this.listaGrup = listaGrup;
	}

	public List<Kurs> getListaKursow() {
		return this.listaKursow;
	}

	/**
	 * 
	 * @param listaKursow
	 */
	public void setListaKursow(List<Kurs> listaKursow) {
		this.listaKursow = listaKursow;
	}

}