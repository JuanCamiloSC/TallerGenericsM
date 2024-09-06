package Punto2;
import java.util.HashSet;

public class MiConjunto<T> {
    private HashSet<T> conjunto;

    public MiConjunto() {
        conjunto = new HashSet<>();
    }

    public void añadir(T elemento) {
        conjunto.add(elemento);
    }

    public void eliminar(T elemento) {
        conjunto.remove(elemento);
    }

    public boolean contiene(T elemento) {
        return conjunto.contains(elemento);
    }

    public void mostrar() {
        System.out.println(conjunto);
    }
}