package com.noveli.cursojava.aulathread6;

public class TiqueTaque {

    // Vou usar como referência o tique para indicar se ele ou o taque está sendo usado no momento
    boolean tique;

    // Sincronizando para que apenas UMA Thread tenha acesso ao objeto tique no momento da execução
    // e também porque o notify() e wait() só funciona com a palavra synchronized
    synchronized void tique(boolean estaExecutando) {

        // Enquanto o Tique estiver executando eu pulo esse if
        // Aqui seria apenas para sair da execução
        if(!estaExecutando) {
            tique = true;
            notify();
            return;
        }

        System.out.print("Tique ");

        tique = true;

        // Notifica a Thread do Taque que pode ser executada
        notify();

        try {
            while(tique) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void taque(boolean estaExecutando) {

        // Enquanto o Tique estiver executando eu pulo esse if.
        // Aqui seria apenas para sair da execução
        if(!estaExecutando) {
            tique = false;
            notify();
            return;
        }

        System.out.println("Taque ");

        tique = false;

        // Notifica a Thread do Tique que pode ser executada
        notify();

        try {
            while(!tique) {
                // Apenas quando receber o notify é que esse método vai voltar
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
