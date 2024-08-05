package org.example.OOP.Inheritance;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Animal - Parent Class");
        Dog d = new Dog();
        d.run();
        d.eat();
        d.sound();

        Goat g = new Goat();
        g.eat();
        g.walk();
        g.sound();

    }
}

class Animal{
    public Animal(){
        System.out.println("Animal constructor called!");
    }
    public void eat(){
        System.out.println("Animal Eating..");
    }
    public void sound(){
        System.out.println("Animal making sound!");
    }
    public void sleeping(){
        System.out.println("animal main class sleeping!");
    }
}

class Dog extends Animal{
    public Dog(){
        super.sleeping();
    }
    public void run(){
        System.out.println("Dog running fast");
    }



}

class Goat extends Animal{
    public void walk(){
        System.out.println("Goat not running its walking slowly!");
    }
}