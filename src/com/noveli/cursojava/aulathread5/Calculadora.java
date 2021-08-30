package com.noveli.cursojava.aulathread5;

public class Calculadora {

    private int soma;

    // synchronized -> apenas UMA Thread pode acessar esse método por vez, não vai permitir que
    // as duas threas acessem ao mesmo tempo a variável soma, alterando seu valor
    public synchronized int somaArray(int[] array) {

        soma = 0;

        for(int valor : array) {
            soma += valor;

            System.out.println("Executando a soma " + Thread.currentThread().getName() +
                    " somando o valor " + valor + " com total de " + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return soma;
    }
}
