package com.noveli.cursojava.exerciciothreadsemaforo;

public class Semaforo {

    Color color;

    public Semaforo(Color color) {
        this.color = color;
    }

    synchronized public void changeColor(Color color) {

        if(this.color == Color.VERMELHO) {
            notify();
        }

    }
}
