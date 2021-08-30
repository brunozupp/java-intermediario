package com.noveli.cursojava.aulathread6;

public class ThreadTiqueTaque implements Runnable {

    TiqueTaque tt;
    Thread thread;

    final int NUM = 5;

    public ThreadTiqueTaque(String nome, TiqueTaque tt) {
        this.tt = tt;

        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {

        if(thread.getName().equalsIgnoreCase("Tique")) {
            for (int i = 0; i < NUM; i++) {
                tt.tique(true);
            }

            // Para terminar a execução
            tt.tique(false);
        } else {

            for (int i = 0; i < NUM; i++) {
                tt.taque(true);
            }

            // Para terminar a execução
            tt.taque(false);
        }
    }
}
