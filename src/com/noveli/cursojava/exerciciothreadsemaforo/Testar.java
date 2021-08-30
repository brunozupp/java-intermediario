package com.noveli.cursojava.exerciciothreadsemaforo;

public class Testar {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo(Color.VERDE);

        SemafaroThread semafaroVerde = new SemafaroThread("Sinal Verde", semaforo, 1000);
        SemafaroThread semafaroAmarelo = new SemafaroThread("Sinal Amarelo", semaforo, 1500);
        SemafaroThread semafaroVermelho = new SemafaroThread("Sinal Vermelho", semaforo, 2000);

        Thread threadVerde = new Thread(semafaroVerde);
        Thread threadAmarelo = new Thread(semafaroAmarelo);
        Thread threadVermelho = new Thread(semafaroVermelho);

        try {
            threadVerde.join();
            threadAmarelo.join();
            threadVermelho.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
