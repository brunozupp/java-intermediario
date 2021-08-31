package com.noveli.cursojava.aulalocale;

import java.util.Locale;

public class Testar {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        System.out.println("Meu locale = " + locale);

        Locale[] locales = Locale.getAvailableLocales();

//        for(Locale l : locales) {
//            System.out.println(l + " - " + l.getDisplayName());
//        }

        Locale br = new Locale("pt", "Brazil");

        System.out.println(br);

        Locale.setDefault(br);
    }
}
