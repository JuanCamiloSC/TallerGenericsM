package Punto1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Punto1 {

    public static void main(String [] args){

        int size = 1000;



        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Medir tiempo de inserción

        long starTime = System.nanoTime();
        for (int i = 0; i < size; i++){
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        System.out.println("Tiempo de inserción en el ArrayList: " + (endTime - starTime));

        starTime = System.nanoTime();
        for (int i = 0; i < size; i++){
            linkedList.add(i);
        }

        endTime = System.nanoTime();
        System.out.println("Tiempo de inserción en la linkedList: " + (endTime - starTime));

        //Medir tiempo de acceso
        starTime = System.nanoTime();

        for(int i = 0; i < size; i++){
            arrayList.get(i);
        }

        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso al ArrayList: " + (endTime - starTime));

        starTime = System.nanoTime();

        for(int i = 0; i < size; i++){
            linkedList.get(i);
        }

        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso a la linkedList: " + (endTime - starTime));

        //Medir riempo de eliminación();

        starTime = System.nanoTime();
        for(int i = size -1; i >= 0; i--){
            arrayList.remove(i);
        }

        endTime = System.nanoTime();
        System.out.println("Tiempo de eliminación en el ArrayList: " + (endTime - starTime));


        starTime = System.nanoTime();
        for(int i = size -1; i >= 0; i--){
            linkedList.remove(i);
        }

        endTime = System.nanoTime();
        System.out.println("Tiempo de eliminación en la LinkedList: " + (endTime - starTime));


    }
}
