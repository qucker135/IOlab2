package Komponenty;

public class FabrykaGrup extends Fabryka {

	public FabrykaGrup() {
		// TODO - implement FabrykaGrup.FabrykaGrup
		// throw new UnsupportedOperationException();
	}

	public Grupa wykonajGrupe(String csv){
		return new Grupa(csv);
	}

}