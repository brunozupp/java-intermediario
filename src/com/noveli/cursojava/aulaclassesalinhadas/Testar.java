package com.noveli.cursojava.aulaclassesalinhadas;

public class Testar {

    public static void main(String[] args) {

        // No java é possível instanciar uma interface a partir de uma instanciação anonima,
        // que seria desse tipo, sobrescrevendo os comportamentos
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto();
    }
}
