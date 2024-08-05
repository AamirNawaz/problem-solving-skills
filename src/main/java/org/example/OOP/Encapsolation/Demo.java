package org.example.OOP.Encapsolation;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Encapsulation in Action!");

        EncapsulationClass e = new EncapsulationClass();
        e.setNum1(55);
        System.out.println(e.sum());
        System.out.println(e.getNum1());

//        System.out.println(r.num1);
//        System.out.println(r.num2);
//        System.out.println(r.result);
    }
}

class EncapsulationClass {
    private int num1 = 50;
    private int num2 = 60;
    private int result = 0;

    public void setNum1(int num){
        this.num1 = num;
    }
    public int sum(){
        result = num1 + num2;
        return result;
    }

    public int getNum1(){
        return num1;
    }

}

