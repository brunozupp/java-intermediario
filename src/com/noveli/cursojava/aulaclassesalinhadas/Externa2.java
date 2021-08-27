package com.noveli.cursojava.aulaclassesalinhadas;

public class Externa2 {

    public void metodoQualquer() {

        // Exemplo de uma classe local
        class ClasseLocal {
            private String texto = "texto classe local dentro do método";

            public void imprimeTexto() {
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();
    }

    public static void main(String[] args) {

        Externa2 externa2 = new Externa2();
        externa2.metodoQualquer();
    }
}
