package Punto5;
import java.util.LinkedList;

public class MiPila<T> {
    private LinkedList<T> pila;

    public MiPila() {
        pila = new LinkedList<>();
    }

    public void push(T elemento) {
        pila.addFirst(elemento);
    }

    public T pop() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.removeFirst();
    }

    public T peek() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.getFirst();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public int tamaño() {
        return pila.size();
    }
}

