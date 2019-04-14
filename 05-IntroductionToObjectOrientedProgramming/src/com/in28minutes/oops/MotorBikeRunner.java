package com.in28minutes.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike dekati = new MotorBike();
        MotorBike adnoh = new MotorBike();
        MotorBike minjae = new MotorBike(10000);
        MotorBike gojek = new MotorBike("pe");

        MotorBike dekati2 = new MotorBike();
        MotorBike adnoh2 = new MotorBike();

        dekati.start();
        adnoh.start();
        dekati.setSpeed(100);
        adnoh.setSpeed(80);

        dekati2.start();
        adnoh2.start();
        dekati2.setSpeed(20);
        adnoh2.setSpeed(0);

        dekati.increaseSpeed(9999);
        adnoh2.increaseSpeed(5555);
        dekati2.increaseSpeed(6975);
        adnoh.decreaseSpeed(2);

        System.out.println(dekati.getSpeed());
        System.out.println(adnoh.getSpeed());

        System.out.println(dekati2.getSpeed());
        System.out.println(adnoh2.getSpeed());

        dekati.stop();
        adnoh.stop();

        dekati2.stop();
        adnoh2.stop();
    }

}








































































