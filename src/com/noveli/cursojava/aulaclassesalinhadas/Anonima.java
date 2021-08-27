package com.noveli.cursojava.aulaclassesalinhadas;

public class Anonima {

    public void imprimeTexto() {
        System.out.println("qualquer dia");
    }

    public static void main(String[] args) {

        // Em tempo de execução vai sobrescrever o comportamento do método
        Anonima anonima = new Anonima() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();
    }
}
