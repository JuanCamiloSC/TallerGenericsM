package Punto5;

public class MainPila {
    public static void main(String[] args) {
        MiPila<Integer> pilaEnteros = new MiPila<>();

        pilaEnteros.push(35);
        pilaEnteros.push(20);
        pilaEnteros.push(60);

        System.out.println("Elemento en la cima (peek): " + pilaEnteros.peek());

        System.out.println("Elemento removido (pop): " + pilaEnteros.pop());

        System.out.println("Elemento en la cima después de pop (peek): " + pilaEnteros.peek());

        System.out.println("Tamaño de la pila: " + pilaEnteros.tamaño());

        System.out.println("¿La pila está vacía? " + pilaEnteros.estaVacia());
    }
}
