package com.noveli.cursojava.aulathread1;

public class Testar {

    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread #1", 1000);

        MinhaThread thread2 = new MinhaThread("Thread #2", 500);
    }
}
