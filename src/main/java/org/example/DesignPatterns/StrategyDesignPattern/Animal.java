package org.example.DesignPatterns.StrategyDesignPattern;

//context
public interface Animal{
    void eating();
    void setSoundStrategy(SoundStrategy soundStrategy);
    void makeSound();
}
