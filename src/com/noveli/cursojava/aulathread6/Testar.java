package com.noveli.cursojava.aulathread6;

public class Testar {

    public static void main(String[] args) {

        TiqueTaque tt = new TiqueTaque();

        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Toque", tt);

        try {
            tique.thread.join();
            taque.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
