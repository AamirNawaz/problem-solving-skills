package org.example.DesignPatterns.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy design pattern in java!");

        Animal dog = new Dog();
        //set dog sound strategy
        dog.setSoundStrategy(new DogSoundStrategy());
        dog.eating(); // Output: Dog eating meal & Bones!
        dog.makeSound(); // Output: "Woof woof"

        Animal lion = new Lion();
        lion.setSoundStrategy(new LionSoundStrategy());
        lion.eating(); // Output: Lion eating fresh meat Only!
        lion.makeSound(); // Output: "Roar Roar"
    }
}



