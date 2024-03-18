package org.example.ui;

import org.example.model.ReverseString;

public class Main {
    static ReverseString r = new ReverseString();

    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        String t = "hello";
        System.out.println(t);
        System.out.println(r.reverseString(t));

        System.out.println("Ejercicio 2");
        int[] notas = {1,2,3,4,5,6};
        System.out.println(r.promedio(notas));


        System.out.println("Ejercicio 3");
        System.out.println(r.division(19,19,0));
        System.out.println("Ejercicio 4");
        System.out.println(r.mcd(50, 150));

        System.out.println("Ejercicio 5");
        System.out.println(r.cambio(500000, 0));



    }
}