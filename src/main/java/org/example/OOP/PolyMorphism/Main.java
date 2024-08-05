package org.example.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism!");

        Dog d = new Dog();
        d.eat();
        d.breath();
        d.sleep();

    }
}

interface Animal{
     void eat();

     void sound();

     default void breath(){
         System.out.println("All animals are beating..!");
     }

     default void sleep(){
         System.out.println("All animal Sleeping!!");
     }


}

class Dog implements Animal{
    public void run(){
        System.out.println("Dog running fast");
    }

    @Override
    public void eat(){
        System.out.println("Dog eating meat and bone");
    }

    @Override
    public void sound(){
        System.out.println("Dog barking at night!");
    }


}

