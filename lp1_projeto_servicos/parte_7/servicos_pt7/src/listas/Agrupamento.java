package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agrupamento<Elemento> {
	private List<Elemento> listaElementos = new ArrayList<Elemento>();
	
	public void adicionar(Elemento elemento) {
		this.listaElementos.add(elemento);
	}
	
	public boolean remover(Elemento elemento) {
		return this.listaElementos.remove(elemento);
	}
	
	public boolean verificarExistencia(Elemento elemento) {
		return this.listaElementos.contains(elemento);
	}

	public ArrayList<Elemento> getListaElementos() {
		return new ArrayList<Elemento>(this.listaElementos);
	}
	
	public void reorganizarElementosLista(Comparator<Elemento> criterioComparador) {
		if(criterioComparador == null) {
			this.listaElementos.sort(null);
		}else {
			Collections.sort(this.listaElementos, criterioComparador);
		}
	}
	
	@Override 
	public String toString() {
		String texto = "";
		for(Elemento elemento : this.listaElementos) {
			texto = texto.concat(elemento.toString()+"\n");
		}
		return texto;
	}
	
	
}
