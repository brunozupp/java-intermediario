package com.noveli.cursojava.aulanumberformat;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Testar {

    public static void main(String[] args) throws ParseException {

        Locale en = new Locale("en", "United Stated");
        NumberFormat nf = NumberFormat.getInstance(en);

        String num = nf.format(100.99);
        System.out.println(num);

        Locale br = new Locale("pt", "BR");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);

        System.out.println(num);

        // MOEDA
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        // PORCENTAGEM
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        porcent.setMaximumIntegerDigits(4);
        porcent.setMinimumIntegerDigits(3);

        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);

        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);

        // ARRENDODAMENTO
        nf = NumberFormat.getInstance(Locale.getDefault());

        nf.setRoundingMode(RoundingMode.DOWN);

        // Só vai fazer o arrendondamento se setar esses valores pra 0
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);

        System.out.println(nf.format(99.50));

        Number num3 = nf.parse("100,00");
        System.out.println(num3.intValue());
    }
}
