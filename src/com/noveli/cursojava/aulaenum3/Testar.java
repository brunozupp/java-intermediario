package com.noveli.cursojava.aulaenum3;

public class Testar {

    public static void main(String[] args) {

        // Enum seria uma coleção de valores, o que me permite iterar sobre eles
        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia : dias) {
            System.out.println(dia);
        }

        System.out.println();

        System.out.println(Enum.valueOf(DiaSemana.class, "QUARTA"));

        DiaSemana dia = DiaSemana.valueOf("SEGUNDA");

        System.out.println(dia);

    }
}
