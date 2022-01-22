package Komponenty;

import java.lang.StringBuilder;

public class Grupa {

	private String kodGrupy;
	private String kodKursu;
	private Forma forma;
	private String nazwiskoProwadzacego;
	private String termin;
	private String nrBudynku;
	private String sala;
	private Integer liczbaZapisanych;
	private Integer maxLiczbaZapisanych;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		sb.append("\n\tkodGrupy: ");
		sb.append(kodGrupy);
		
		sb.append("\n\tkodKursu: ");
		sb.append(kodKursu);
		
		sb.append("\n\tForma: ");
		sb.append(forma.toString());
		
		sb.append("\n\tNazwisko prowadzacego: ");
		sb.append(nazwiskoProwadzacego);
		
		sb.append("\n\tTermin: ");
		sb.append(termin);
		
		sb.append("\n\tNumer budynku: ");
		sb.append(nrBudynku);
		
		sb.append("\n\tSala: ");
		sb.append(sala);
		
		sb.append("\n\tLiczba zapisanych: ");
		sb.append(liczbaZapisanych.toString());
		
		sb.append("\n\tMaksymalna liczba zapisanych: ");
		sb.append(maxLiczbaZapisanych.toString());
		
		sb.append("\n]");
		
		return sb.toString();
	}

	public String getKodGrupy() {
		return this.kodGrupy;
	}

	/**
	 * 
	 * @param kodGrupy
	 */
	public void setKodGrupy(String kodGrupy) {
		this.kodGrupy = kodGrupy;
	}

	public String getKodKursu() {
		return this.kodKursu;
	}
        
        @Override
        public boolean equals(Object o){
            Grupa grupa = (Grupa)o;
            return this.kodGrupy.equals(grupa.kodGrupy) && this.kodKursu.equals(grupa.kodKursu) && this.nazwiskoProwadzacego.equals(grupa.nazwiskoProwadzacego);
        }

	/**
	 * 
	 * @param kodKursu
	 */
	public void setKodKursu(String kodKursu) {
		this.kodKursu = kodKursu;
	}

	public Forma getForma() {
		return this.forma;
	}

	/**
	 * 
	 * @param forma
	 */
	public void setForma(Forma forma) {
		this.forma = forma;
	}

	public String getNazwiskoProwadzacego() {
		return this.nazwiskoProwadzacego;
	}

	/**
	 * 
	 * @param nazwiskoProwadzacego
	 */
	public void setNazwiskoProwadzacego(String nazwiskoProwadzacego) {
		this.nazwiskoProwadzacego = nazwiskoProwadzacego;
	}

	public String getTermin() {
		return this.termin;
	}

	/**
	 * 
	 * @param termin
	 */
	public void setTermin(String termin) {
		this.termin = termin;
	}

	public String getNrBudynku() {
		return this.nrBudynku;
	}

	/**
	 * 
	 * @param nrBudynku
	 */
	public void setNrBudynku(String nrBudynku) {
		this.nrBudynku = nrBudynku;
	}

	public String getSala() {
		return this.sala;
	}

	/**
	 * 
	 * @param sala
	 */
	public void setSala(String sala) {
		this.sala = sala;
	}

	public Integer getLiczbaZapisanych() {
		return this.liczbaZapisanych;
	}

	/**
	 * 
	 * @param liczbaZapisanych
	 */
	public void setLiczbaZapisanych(Integer liczbaZapisanych) {
		this.liczbaZapisanych = liczbaZapisanych;
	}

	public Integer getMaxLiczbaZapisanych() {
		return this.maxLiczbaZapisanych;
	}

	/**
	 * 
	 * @param maxLiczbaZapisanych
	 */
	public void setMaxLiczbaZapisanych(Integer maxLiczbaZapisanych) {
		this.maxLiczbaZapisanych = maxLiczbaZapisanych;
	}

	/**
	 * 
	 * @param csv
	 */
	public Grupa(String kodGrupy, String kodKursu, String prowadzacy) {
		this.kodGrupy = kodGrupy;
		this.kodKursu = kodKursu;
		forma = Forma.WYKLAD;
		nazwiskoProwadzacego = prowadzacy;
		termin = "Poniedziałek 9:15";
		nrBudynku = "C4";
		sala = "205";
		liczbaZapisanych = 26;
		maxLiczbaZapisanych = 30;
	}
}