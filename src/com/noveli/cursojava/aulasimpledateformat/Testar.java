package com.noveli.cursojava.aulasimpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Testar {

    public static void main(String[] args) {

        //SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");

        // Deixando assim -> dd/MM eu vou ter o zero quando o número for menor que 10
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

        Calendar data = new GregorianCalendar(2010,2,20,14,32,25);

        System.out.println(sdf.format(data.getTime()));

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";

        try {
            Date minhaDataParseada = sdf1.parse(minhaData);
            System.out.println(sdf.format(minhaDataParseada));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
