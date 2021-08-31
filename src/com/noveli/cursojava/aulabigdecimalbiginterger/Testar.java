package com.noveli.cursojava.aulabigdecimalbiginterger;

import java.math.BigDecimal;

public class Testar {

    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);

        // Usar o BigDecimal para precisão no calculo, nas casas decimais no caso
        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);

    }
}
