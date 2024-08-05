package org.example.OOP.Abstraction;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Abstraction in action!");

        Suzuki s = new Suzuki();
        s.startEngine();
        s.Fuel();
        s.stopEngine();

        Bike b = new Bike();
        b.Fuel();
        b.startEngine();
        b.stopEngine();

    }
}

abstract class Vehical{
    abstract void startEngine();

     abstract void stopEngine();

     public void Fuel(){
         System.out.println("Vehicle Needs fuel!");
     }
}

class Suzuki extends Vehical{

    @Override
    void startEngine() {
        System.out.println("Suzuki Engine started!");
    }

    @Override
    void stopEngine() {
        System.out.println("Suzuki Engine Stop!");
    }

    @Override
    public void Fuel(){
        System.out.println("Suzuki Runs on Petrol & CNG fuel!");
    }

}

class Bike extends Vehical{

    @Override
    void startEngine() {
        System.out.println("Bike Engine Started!");
    }

    @Override
    void stopEngine() {
        System.out.println("Bike Engine Stop");
    }

    @Override
    public void Fuel(){
        System.out.println("Bike Runs on Petrol fuel Only!");
    }
}

