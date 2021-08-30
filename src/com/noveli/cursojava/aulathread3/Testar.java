package com.noveli.cursojava.aulathread3;

public class Testar {

    public static void main(String[] args) {

        // Essa minha classe não é uma Thread ainda, só implementa a interface
        // tem que passar isso pra uma Thread mesmo
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 1000);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 1500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // Exemplo 1
//        t1.start();
//        t2.start();
//        t3.start();

//        while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        // Exemplo 2
        // Vai esperar a execução da thread para só depois executar o código
//        try {
//            t1.join(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Ela só seram executas depois que a thread2 terminar
//        t2.start();
//
//        try {
//            t2.join(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Ela só seram executas depois que a thread3 terminar
//        t3.start();

//      System.out.println("Fim do programa");

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Só vai ser executado depois que todas as thread serem executadas
        System.out.println("Fim do programa");
    }
}
