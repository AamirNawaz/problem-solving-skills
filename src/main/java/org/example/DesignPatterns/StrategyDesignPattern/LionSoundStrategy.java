package org.example.DesignPatterns.StrategyDesignPattern;

public class LionSoundStrategy implements SoundStrategy{
    @Override
    public void makeSound(){
        System.out.println("Roar Roar!");
    }
}
