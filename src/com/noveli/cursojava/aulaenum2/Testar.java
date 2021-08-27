package com.noveli.cursojava.aulaenum2;

import com.noveli.cursojava.aulaenum2.DiaSemana;

public class Testar {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.QUARTA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1,4,2016, DiaSemana.QUARTA);
    }
}
