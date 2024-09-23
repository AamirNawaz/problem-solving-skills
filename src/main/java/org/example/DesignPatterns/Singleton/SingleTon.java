package org.example.DesignPatterns.Singleton;

public class SingleTon {
    public static void main(String[] args) {
        System.out.println("Singleton design pattern!");

        SingleTonPattern  Sp = SingleTonPattern.getSingleTonPatternInstance();
        SingleTonPattern  Sp1 = SingleTonPattern.getSingleTonPatternInstance();

        //both will be printing same instance names
        System.out.println(Sp); //@5f184fc6
        System.out.println(Sp1); //@5f184fc6


    }
}

class SingleTonPattern{
    private static SingleTonPattern instance;
    private SingleTonPattern(){}

    public static SingleTonPattern getSingleTonPatternInstance(){
        if(instance==null){
            instance = new SingleTonPattern();
        }
        return instance;
    }
}