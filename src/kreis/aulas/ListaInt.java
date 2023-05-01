package kreis.aulas;

import java.util.ArrayList;
import java.util.List;

public class ListaInt {
	private List<Integer> lista;

    public ListaInt() {
        lista = new ArrayList<>();
    }

    public void adicionar(int elemento) {
        lista.add(elemento);
    }

    public int remover(int indice) {
        return lista.remove(indice);
    }

    public int obter(int indice) {
        return lista.get(indice);
    }

    public int tamanho() {
        return lista.size();
    }
}
