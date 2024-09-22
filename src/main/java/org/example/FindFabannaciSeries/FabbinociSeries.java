package org.example.FindFabannaciSeries;

public class FabbinociSeries {
    public static void main(String[] args) {
        System.out.println("How to Find a Fabinnoci series of number!");

        //callig to Fabinnoci function
        for(int i =0; i<15; i++){
            Fabinnoci(i);
        }

    }

    public static Number Fabinnoci(int num){
        if(num <1){
            return num;
        }else{
            return (Fabinnoci(num-1) + Fabinnoci(num -2));
        }

    }
}
