package Punto4;

public class MainCaja {
    public static void main(String[] args) {

        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.poner(123);
        System.out.println("Contenido de la caja: " + cajaEntero.sacar());

        Caja<String> cajaString = new Caja<>();
        cajaString.poner("Hola, Mundo");
        System.out.println("Contenido de la caja: " + cajaString.sacar());
    }
}
