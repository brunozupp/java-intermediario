package com.noveli.cursojava.aulajava8dates;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Testar {

    public static void main(String[] args) {

        // É usado o padrão ISO
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2019,2,1));
        System.out.println(LocalDate.parse("2019-02-01"));

        // Adicionar dias
        System.out.println(agora.plusDays(30));

        // Diminuir a data
        System.out.println(agora.minus(1, ChronoUnit.MONTHS));

        System.out.println(agora.getDayOfMonth());
        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.getDayOfYear());

        // É ano bissexto
        System.out.println(agora.isLeapYear());

        // O LocalTime e LocalDateTime segue a mesma consistência do LocalDate

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();

        for(String f : fusos) {
            System.out.println(f);
        }

        ZoneId sp = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
        System.out.println(zdt);

        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);

        System.out.println(offsetdt);

        Date date = new Date();
        Calendar c = Calendar.getInstance();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
    }
}
