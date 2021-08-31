package com.noveli.cursojava.aularesourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Testar {

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("meutexto");

        System.out.println("Olá: " + rb.getString("hello"));
    }
}
