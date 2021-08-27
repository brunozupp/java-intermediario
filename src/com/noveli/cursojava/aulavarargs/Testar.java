package com.noveli.cursojava.aulavarargs;

public class Testar {

    public static void main(String[] args) {

        System.out.println(somar(1.5,5.8,6.9,8));
    }

    // double... valores | double ...valores | double...valores -> qualquer forma vai funcionar
    private static double somar(double...valores) {

        double sum = 0.0;

        for(double valor : valores) {
            sum += valor;
        }

        return sum;
    }
}
