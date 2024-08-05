package org.example.OOP.Interfaces;

class Main{
    public static void main(String[] args) {
        System.out.println("Interface in java");

        Suzuki s = new Suzuki();
        s.engineStart();
        s.engineStop();
        s.fuel();

    }
}
public interface Vehicle {
    void engineStart();
    void engineStop();

    default void fuel(){
        System.out.println("Vehicle Needs fuel to start!");
    }
}

class Suzuki implements Vehicle{

    @Override
    public void engineStart() {
        System.out.println("Suzuki engine Started!");
    }

    @Override

    public void engineStop() {
        System.out.println("Suzuki engine Stop!");
    }

    @Override
    public void fuel() {
        Vehicle.super.fuel();
    }
}
