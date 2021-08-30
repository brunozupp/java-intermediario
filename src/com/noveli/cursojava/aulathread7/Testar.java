package com.noveli.cursojava.aulathread7;

public class Testar {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.suspend();

        t1.resume();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.resume();
    }
}
