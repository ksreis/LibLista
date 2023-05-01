package kreis.aulas;

import java.util.ArrayList;
import java.util.List;

public class ListaStrings {
	 private List<String> lista;

	    public ListaStrings() {
	        lista = new ArrayList<>();
	    }

	    public void adicionar(String elemento) {
	        lista.add(elemento);
	    }

	    public String remover(int indice) {
	        return lista.remove(indice);
	    }

	    public String obter(int indice) {
	        return lista.get(indice);
	    }

	    public int tamanho() {
	        return lista.size();
	    }
}
