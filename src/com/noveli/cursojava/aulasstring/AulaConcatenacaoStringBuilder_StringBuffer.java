package com.noveli.cursojava.aulasstring;

public class AulaConcatenacaoStringBuilder_StringBuffer {

    public static void main(String[] args) {

        String[] letras = {"B","C","D","E","F"};

        // Mais performatico usar StringBuffer pra concatenar que aquele +=
        StringBuffer sb = new StringBuffer();

        for(String letra : letras) {
            sb.append(letra);
        }

        System.out.println(sb.toString());

        String alfabeto = new String(sb);

        System.out.println(alfabeto);

        StringBuilder sb_ = new StringBuilder();
        for(String letra : letras) {
            sb_.append(letra);
        }

        System.out.println(sb_.toString());

        // StringBuffer é thread safe, já o StringBuilder não é
    }
}
