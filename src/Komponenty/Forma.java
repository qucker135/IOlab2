package Komponenty;

public enum Forma {
	WYKLAD("Wyklad"),
	CWICZENIA("Cwiczenia"),
	LABORATORIA("Laboratoria"),
	PROJEKT("Projekt"),
	SEMINARIUM("Seminarium"),
	INNE("Inne");

	private String forma;

	/**
	 * 
	 * @param forma
	 */
	Forma(String forma) {
		this.forma = forma;
	}

	public String toString() {
		return forma;
	}

}