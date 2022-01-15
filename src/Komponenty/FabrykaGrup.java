package Komponenty;

public class FabrykaGrup extends Fabryka {

	public FabrykaGrup() {
		// TODO - implement FabrykaGrup.FabrykaGrup
		// throw new UnsupportedOperationException();
	}

	public Grupa wykonajGrupe(String kodGrupy, String kodKursu, String prowadzacy){
		return new Grupa(kodGrupy, kodKursu, prowadzacy);
	}

}