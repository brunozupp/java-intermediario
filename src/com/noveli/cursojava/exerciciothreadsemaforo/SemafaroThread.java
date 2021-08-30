package com.noveli.cursojava.exerciciothreadsemaforo;

public class SemafaroThread implements Runnable {

    String name;
    Semaforo semaforo;
    int duration;

    public SemafaroThread(String name, Semaforo semaforo, int duration) {
        this.name = name;
        this.semaforo = semaforo;
        this.duration = duration;
    }

    @Override
    public void run() {

    }
}
