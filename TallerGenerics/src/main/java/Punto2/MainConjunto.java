package Punto2;

public class MainConjunto {
    public static void main(String[] args) {

        MiConjunto<Integer> conjuntoEnteros = new MiConjunto<>();

        conjuntoEnteros.añadir(10);
        conjuntoEnteros.añadir(20);
        conjuntoEnteros.añadir(30);

        System.out.println("Conjunto después de añadir elementos:");
        conjuntoEnteros.mostrar();

        System.out.println("¿El conjunto contiene 20? " + conjuntoEnteros.contiene(20));

        conjuntoEnteros.eliminar(20);

        System.out.println("Conjunto después de eliminar 20:");
        conjuntoEnteros.mostrar();

    }
}
