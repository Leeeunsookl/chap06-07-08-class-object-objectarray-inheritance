package com.ohgiraffers.section04.uses;

public class Application {

    public static void main(String[] args) {

        Car c1= new RacingCar();
        Car c2= new FireCar();

        c1.go();
        c2.go();

        c1.stop();
        c2.go();

        ((FireCar)c2).horn();

        System.out.println("===========================================");

        Soundable c3 = new FireCar();
        c3.horn();


    }

}
