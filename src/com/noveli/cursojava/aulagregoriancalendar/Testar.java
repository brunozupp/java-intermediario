package com.noveli.cursojava.aulagregoriancalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Testar {

    public static void main(String[] args) {

        // Calendar é uma classe abstrata
        Calendar hoje1 = Calendar.getInstance();

        // Extende a classe Calendar
        GregorianCalendar hoje = new GregorianCalendar();

        imprimir(hoje);
    }

    public static void imprimir(Calendar data) {
        int ano = data.get(Calendar.YEAR);
        int mes = data.get(Calendar.MONTH);
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int hora = data.get(Calendar.HOUR);
        int minutos = data.get(Calendar.MINUTE);
        int segundos = data.get(Calendar.SECOND);

        System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d",dia,(mes + 1),ano,hora,minutos,segundos);

        System.out.println();
    }
}
