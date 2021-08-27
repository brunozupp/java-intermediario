package com.noveli.cursojava.aulawrapper;

public class Testar {

    public static void main(String[] args) {

        // Tipos primitivos

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000L;

        float num5 = 3.5F;
        double num6 = 3.5555555;

        char a = 'a';

        boolean flag1 = true;

        // Tipos classe (Classes Wrappers) dos tipos primitivos

        // Os tipos classe que recebem o new estão depreciados, passa o valor direto (B oxing)
        //Short num7 = new Short((byte)1);
        Short num8 = 1;
        Byte num9 = 10;
        Integer num10 = 100;
        Long num11 = 100L;

        Float num12 = 3.5F;
        Double num13 = 3.5555555;

        Character b = 'b';

        Boolean flag2 = true;

        Long num14 = num10.longValue();

        int num15 = Integer.parseInt("5");

        // Unboxing
        int num16 = num15;

        System.out.println(num11 == num14);
    }
}
