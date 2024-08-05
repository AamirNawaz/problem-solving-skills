package org.example.OOP.Polymorphism;

public class OverLoadingConcept {
    public static void main(String[] args) {
        System.out.println("Function overloading!");

        AnimalClass an = new AnimalClass();
        an.eat("Goat");
        an.eat();
    }
}

//Function Overloading in action
class AnimalClass{
    public void eat(){
        System.out.println("Animal Eating!");
    }

    public void eat(String name){
        System.out.println(name + " this animal eating grass!");
    }


}
