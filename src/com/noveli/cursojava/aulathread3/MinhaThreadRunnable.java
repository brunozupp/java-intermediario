package com.noveli.cursojava.aulathread3;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
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
