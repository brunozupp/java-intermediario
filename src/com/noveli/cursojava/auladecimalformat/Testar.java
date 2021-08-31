package com.noveli.cursojava.auladecimalformat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Testar {

    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);

        //df.applyPattern(padrao);
        System.out.println(df.format(1234568.891));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "BR"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(1234568.891));

        String padrao3 = "###,###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(1234568.891));

        String padrao4 = "###,###,##0.00";
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(0.1));
    }
}
