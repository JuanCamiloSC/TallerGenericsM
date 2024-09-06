package Punto3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaDePalabras {
    public static void main(String[] args) {

        HashMap<String,Integer> frecuenciaPalabras= new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el texto: ");
        String texto = sc.nextLine();

        String[] palabras = texto.split("[\\s.,!?;:]+");

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }
        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        sc.close();
    }
}
