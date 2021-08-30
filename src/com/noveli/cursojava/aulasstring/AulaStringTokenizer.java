package com.noveli.cursojava.aulasstring;

import java.util.StringTokenizer;

public class AulaStringTokenizer {

    public static void main(String[] args) {

        String doArquivo = "1;Antonio;30";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
