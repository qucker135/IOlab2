package Komponenty;

public enum Jezyk {
	POL("Polski"),
	ANG("Angielski");

	private String jezyk;

	/**
	 * 
	 * @param jezyk
	 */
	Jezyk(String jezyk) {
		this.jezyk = jezyk;
	}

	public String toString() {
		return jezyk;
	}

}