package Komponenty;

//import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Kurs {

	private String kodKursu;
	private String nazwa;
	private Map<Forma, Integer> formy = new HashMap<Forma, Integer>();
	private Jezyk jezyk;

	public String getKodKursu() {
		return this.kodKursu;
	}

	/**
	 * 
	 * @param kodKursu
	 */
	public void setKodKursu(String kodKursu) {
		this.kodKursu = kodKursu;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	/**
	 * 
	 * @param nazwa
	 */
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Map<Forma, Integer> getFormy() {
		return this.formy;
	}

	/**
	 * 
	 * @param formy
	 */
	public void setFormy(Map<Forma, Integer> formy) {
		this.formy = formy;
	}

	public Jezyk getJezyk() {
		return this.jezyk;
	}

	/**
	 * 
	 * @param jezyk
	 */
	public void setJezyk(Jezyk jezyk) {
		this.jezyk = jezyk;
	}

	/**
	 * 
	 * @param csv
	 */
	public Kurs(String csv) {
		kodKursu = csv;
		nazwa = "Matematyka dyskretna";
		formy = new HashMap<Forma, Integer>();
		jezyk = Jezyk.ANG;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");

		sb.append("\n\tkodKursu: ");
		sb.append(kodKursu);

		sb.append("\n\tNazwa: ");
		sb.append(nazwa.toString());

		sb.append("\n\tForma: ");
		sb.append(formy.toString());

		sb.append("\n\tJezyk: ");
		sb.append(jezyk.toString());

		sb.append("\n]");

		return sb.toString();
	}

}