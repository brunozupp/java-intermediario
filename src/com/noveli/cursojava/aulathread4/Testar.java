package com.noveli.cursojava.aulathread4;

import com.noveli.cursojava.aulathread3.MinhaThreadRunnable;

public class Testar {

    public static void main(String[] args) {

        // Essa minha classe não é uma Thread ainda, só implementa a interface
        // tem que passar isso pra uma Thread mesmo
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // Valor vai de 1 a 10, sendo 1 com menos prioridade e 10 com a maior prioridade
//        t1.setPriority(5);
//        t2.setPriority(3);
//        t3.setPriority(1);

        // ou
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }
}
