package com.noveli.cursojava.aulaenum2;

public enum DiaSemana {

    // Passando o valor para os construtores de cada enum
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private int valor;

    DiaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
