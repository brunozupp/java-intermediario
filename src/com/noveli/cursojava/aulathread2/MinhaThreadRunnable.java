package com.noveli.cursojava.aulathread2;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;

        // Essa minha classe não é uma Thread ainda, só implementa a interface
        // tem que passar isso pra uma Thread mesmo
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);

                // Vai dormir por 1 segundo e depois volta
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrompido");
        }
    }
}
