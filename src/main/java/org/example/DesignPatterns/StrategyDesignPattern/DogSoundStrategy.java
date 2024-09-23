package org.example.DesignPatterns.StrategyDesignPattern;

//concrete Strategies
public class DogSoundStrategy implements SoundStrategy{

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
