package org.example.DesignPatterns.FactoryDesignPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        System.out.println("Factory Design pattern in Java!");

        AnimalFactory af = new AnimalFactory();
        Animal dogAnimal  = new AnimalFactory().getAnimal("Dog");
        Animal lionAnimal = new AnimalFactory().getAnimal("Lion");

        dogAnimal.eating(); //output: meat & bones
        lionAnimal.eating(); //output: fresh meat only!
    }
}

interface Animal{
    public void eating();
}

class Dog implements Animal{

    @Override
    public void eating() {
        System.out.println("Dog eating meal & Bones!");
    }

    public void run(){
        System.out.println("Dog run slow!");
    }
}

class Lion implements Animal{

    @Override
    public void eating() {
        System.out.println("Lion eating fresh meat Only!");
    }

    public void run(){
        System.out.println("Lion running very fast!");
    }
}


class AnimalFactory{
    public Animal getAnimal(String animalType){
        if(animalType ==null){
            return null;
        }
        if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        if(animalType.equalsIgnoreCase("Lion")){
            return new Lion();
        }
        return null;
    }
}