package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("/***************************************************/");
        System.out.println("-------------  Prime Number Checker ---------------");
        System.out.println("/***************************************************/");


        //Solution
        int number = 5;
        boolean isPrime = isPrimNumber(number);
        if(isPrime){
            System.out.println(number + " is prime number!");
        }else {
            System.out.println(number + " is not a prime number!");
        }

    }

    //Prime Number method
    public static boolean isPrimNumber(int number){
        if(number %2 ==0){
            return false;
        }
        return true;
    }


}