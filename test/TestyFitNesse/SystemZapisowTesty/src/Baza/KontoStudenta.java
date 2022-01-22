package Baza;

import Komponenty.*;
import java.util.List;
import java.util.ArrayList;

public class KontoStudenta {

	private List<Grupa> listaGrup = new ArrayList<Grupa>();
           
        public KontoStudenta() {}
        
        public KontoStudenta(ArrayList<Grupa> listaGrup){
            this.listaGrup = listaGrup;
        }
        
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

}