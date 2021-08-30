package com.noveli.cursojava.aulasstring;

public class Aula4 {

    public static void main(String[] args) {

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola);

        System.out.println("ola equals ola2 = " + ola.equals(ola2)); // false
        System.out.println("ola equals ola3 = " + ola.equals(ola3)); // true

        System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); // true

        System.out.println("ola == ola2 " + (ola == ola2)); // false

        // Por ser o mesmo valor na String, as variáveis vão estar apontando para o mesmo endereço
        // de memória lá na pool, por isso dá true
        System.out.println("ola == ola3 " + (ola == ola3)); // true

        // Aqui vai dar false pois ola4 foi criado usando o new String(), que gera uma nova instância, mesmo
        // o valor sendo igual
        System.out.println("ola == ola4 = " + (ola == ola4)); // false
        System.out.println("ola equals ola4 = " + ola.equals(ola4)); // true -> comparando só o valor

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";


        System.out.println(banana.regionMatches(1,ana,0,3)); // true
        System.out.println(banana.regionMatches(1,ana,1,2)); // false
        System.out.println(banana.regionMatches(2,ana,1,2)); // true
    }
}
