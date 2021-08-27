package com.noveli.cursojava.aulaprintf;

public class Testar {

    public static void main(String[] args) {

        System.out.printf("Hello %s", "Olá Mundo");

        System.out.println();

        // %S passa all o texto do argumento para caixa alta
        System.out.printf("%S", "Olá, Mundo");

        System.out.println();

        System.out.printf("%c %C", 'a', 'b');

        // Pulando linha
        System.out.printf("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);

        double flutuante = 3.1456789;
        System.out.printf("%f", flutuante);

        System.out.println();

        String olaMundo = "Olá mundo";
        // Por padrão o alinhamento vai ser a direita
        System.out.printf("%20s", olaMundo);
        System.out.println();
        System.out.printf("%-20s", olaMundo);

        System.out.println();

        // + vai fazer com que imprima se o número é positivo ou negativo
        System.out.printf("%+d", valor);

        System.out.println();

        // O valor vai ter que ter 15 digitos, o restante completa com 0
        System.out.printf("%015d", valor);

        System.out.println();

        // Separar as casas por virgula (se for EUA) ou ponto (no caso do brasil). No meu tem que deixar
        // com ',', pois se colocar o '.' dá erro
        System.out.printf("%,d", valor);

        System.out.println();

        int valor2 = -123456789;

        // Com o espaço entre o % e o 'd', não imprime o sinal negativo
        System.out.printf("% d", valor);

        System.out.println();

        System.out.printf("%.2f", flutuante);
        System.out.println();
        System.out.printf("%.3f", flutuante);
        System.out.println();
        System.out.printf("%.4f", flutuante);
        System.out.println();

        // Saida de um número monetário
        System.out.printf("R$%10.2f", flutuante);

        System.out.println();
        System.out.println();

        testeMaisCompleto();
    }

    private static void testeMaisCompleto() {

        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }
    }
}
