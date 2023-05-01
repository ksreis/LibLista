package kreis.aulas;

import java.util.ArrayList;
import java.util.List;

public class ListaObject<T> {
    private List<T> lista;

    public ListaObject() {
        lista = new ArrayList<>();
    }

    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    public T remover(int indice) {
        return lista.remove(indice);
    }

    public T obter(int indice) {
        return lista.get(indice);
    }

    public int tamanho() {
        return lista.size();
    }
}