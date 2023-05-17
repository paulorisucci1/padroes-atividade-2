package grafo.dirigido;

import grafo.dirigido.Vertice;

public interface GrafoIterator<T> {

    Vertice<T> getNext();

    boolean hasMore();
}
