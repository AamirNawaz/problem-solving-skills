package org.example.DesignPatterns.StrategyDesignPattern;

public class Lion implements Animal{
    private SoundStrategy soundStrategy;
    @Override
    public void eating() {
        System.out.println("Lion eating fresh meat Only!");
    }

    @Override
    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy.makeSound();
    }

    @Override
    public void makeSound() {
        soundStrategy.makeSound();
    }
}
