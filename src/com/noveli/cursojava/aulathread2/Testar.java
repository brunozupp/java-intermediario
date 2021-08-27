package com.noveli.cursojava.aulathread2;

public class Testar {

    public static void main(String[] args) {

        // Essa minha classe não é uma Thread ainda, só implementa a interface
        // tem que passar isso pra uma Thread mesmo
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 1000);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 1500);

//        Thread t1 = new Thread(thread);
//        t1.start();
    }
}
