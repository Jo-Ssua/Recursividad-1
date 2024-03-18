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

    public String cambio(int m, int counter){
        int temp = m;

        if(temp < 50){
            return  "";
        }

        int[] money = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};


        if(m >= money[counter]){
            temp = m - money[counter];


            return money[counter] + " "+ cambio(temp,counter);

        }else{

            return cambio(temp,counter+1);
        }








    }




    


}



