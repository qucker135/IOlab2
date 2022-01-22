package Komponenty;

public class FabrykaKursow extends Fabryka {

	public FabrykaKursow() {
		// TODO - implement FabrykaKursow.FabrykaKursow
		// throw new UnsupportedOperationException();
	}

	public Kurs wykonajKurs(String kodKursu, String nazwa){
		return new Kurs(kodKursu, nazwa);
	}
}