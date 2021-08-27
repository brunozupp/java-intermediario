package com.noveli.cursojava.exercicioenum;

public class Testar {

    public static void main(String[] args) {

        double x = 4.0;
        double y = 2.0;

        for (Operacao operacao : Operacao.values()) {
            System.out.println(x + " " + operacao + " " + y + " = " + operacao.executarOperacao(x,y));
        }
    }
}
