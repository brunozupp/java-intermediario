package com.noveli.cursojava.aulaenum1;

public class Testar {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.QUARTA;

        switch (dia) {
            case SEGUNDA:
                System.out.println("SEGUNDA");
                break;
            case TERCA:
                System.out.println("TERCA");
                break;
            case QUARTA:
                System.out.println("QUARTA");
                break;
            case QUINTA:
                System.out.println("QUINTA");
                break;
            case SEXTA:
                System.out.println("SEXTA");
                break;
            case SABADO:
                System.out.println("SABADO");
                break;
            case DOMINGO:
                System.out.println("DOMINGO");
                break;

        }
    }
}
