package org.example.model;

public class ReverseString {


    public ReverseString(){

    }

    public String reverseString(String chain){
        char[] c = chain.toCharArray();
       int x =  c.length-1;
       int i = 0;
       String temp = order(c,i,x);

        return temp;

    }

    public String order(char[] c, int i, int x){
        int mid = c.length /2;
        if(i< mid){
            char temp = c[i];
            c[i] = c[x];
            c[x] = temp;
            order(c, i+1, x-1);


        }

        return new String(c);



    }


    public double promedio(int[] notas){

        int mid = notas.length /2;

        double sum = 0;
        sum = prom(notas,0, notas.length-1);



        return sum/ notas.length;

    }

    public double prom(int[] c, int i, int x){
        int mid = c.length/2;
        if(i == mid){

            return 0;


        }

        int sum = c[i] + c[x];
        return sum + prom(c, i+1, x-1);



    }


    //El tercer valor corresponde al numero de veces que se ejecuta la resta. Por ende siempre debe iniciar en cero
    public String division(int i, int x, int value){
        int temp = 0;
        if(i >= x){
            temp = i-x;
            return division(temp,x, value+1);
            
            


        }else{
            return "El resultado es " + value + " Y su residuo es " + temp;
            
        }

      



    }

    public int mcd(int a, int b){


        if(a%b == 0 ){

            return b;

        }else if (b %a == 0){
            return mcd(b,a);

        }else{
            return 0;
        }







    }

    


}



