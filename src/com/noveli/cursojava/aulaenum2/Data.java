package com.noveli.cursojava.aulaenum2;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;

    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public Data() {}
}
