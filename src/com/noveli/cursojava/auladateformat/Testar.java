package com.noveli.cursojava.auladateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Testar {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        // Caso eu queria mudar a internacionalização do meu formatador, configuro o Locale
        Locale.setDefault(new Locale("pt","BR"));

        String hojeFormatado = DateFormat.getInstance().format(hoje);

        System.out.println(hojeFormatado);

        String horarioFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(horarioFormatado);

        String dataFormatada = DateFormat.getDateInstance().format(hoje);
        System.out.println(dataFormatada);

        // Para fazer de String para data precisa prestar atenção no Locale, para passar a String no formato certo
        // No caso, como está no Brasil, vai ser 31/08/2021 13:55

        String data = "31/08/2021 13:55";

        try {
            Date dataParseada = DateFormat.getInstance().parse(data);
            System.out.println(dataParseada);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataParseada);

            System.out.println(calendario);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
