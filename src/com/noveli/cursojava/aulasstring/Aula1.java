package com.noveli.cursojava.aulasstring;

public class Aula1 {

    public static void main(String[] args) {

        String vazia = new String();
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = {'J','A','V','A'};
        String java2 = new String(charsJava);

        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);

        // Cada byte representa um caractere da tabela ascii
        byte[] ascii = {65,66,67,68,69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        String bcd = new String(ascii,1,3);
        System.out.println(bcd);

        // java3 e java4 possuem o mesmo endereço de memória
        String java3 = "JAVA";
        String java4 = "JAVA";
        String java5 = new String("JAVA");
        System.out.println(java3);

        /**
         * IMPORTANTE SOBRE CONCATENAÇÃO
         * Strings são Imutaveis, ou seja, seu valor NÃO muda.
         * Então toda vez que faz uma concatenação, uma nova referencia a esse valor da string
         * é criado, o que faz mudar a sua referência na memória.
         *
         * E uasr o concatenacao += "novo valor para ser adicionado";
         * é uma má prática, pois o consumo de performance é maior
         */

    }
}
