package org.example.DesignPatterns.StrategyDesignPattern;

public class Dog implements Animal{
    private SoundStrategy soundStrategy;

    @Override
    public void eating() {
        System.out.println("Dog eating meal & Bones!");
    }

    @Override
    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

    @Override
    public void makeSound() {
        soundStrategy.makeSound();
    }
}
