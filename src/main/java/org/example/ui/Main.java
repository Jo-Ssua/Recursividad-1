package org.example.ui;

import org.example.model.ReverseString;

public class Main {
    static ReverseString r = new ReverseString();

    public static void main(String[] args) {

        String t = "hello";
        System.out.println(t);
        System.out.println(r.reverseString(t));

        int[] notas = {1,2,3,4,5,6};
        System.out.println(r.promedio(notas));

        System.out.println(r.division(19,19,0));
        System.out.println(r.mcd(50, 150));



    }
}