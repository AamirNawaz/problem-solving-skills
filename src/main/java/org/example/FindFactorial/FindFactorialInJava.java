package org.example.FindFactorial;

public class FindFactorialInJava {
    public static void main(String[] args){
        System.out.println("Find factorial of number using java!");
        factorial(5);
    }

    public static void factorial(int n){
        if(n<=1){
            System.out.println("Number must be greater than 1");
        }
        int fact = 1;
        for(int i =1; i <=n; i++){
               fact = fact* i;
        }
        System.out.println(fact);
    }
}
