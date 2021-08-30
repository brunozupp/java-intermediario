package com.noveli.cursojava.aulasstring;

public class Aula3 {

    public static void main(String[] args) {

        String java = "Java";

        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        // Isso aqui
        char[] jav = new char[3];
        java.getChars(0,3,jav,0);
        System.out.println(jav);

        // Seria o mesmo que esse
        for(int i = 0, j = 0; i < 3; i++, j++) {
            jav[j] = java.charAt(i);
        }
        System.out.println(jav);

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
    }

}
