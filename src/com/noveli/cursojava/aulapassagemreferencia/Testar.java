package com.noveli.cursojava.aulapassagemreferencia;

public class Testar {

    public static void main(String[] args) {

        Contato contato = new Contato("Bruno", 10);

        System.out.println(contato);

        mudar1(contato);

        System.out.println(contato);

        mudar2(contato);

        System.out.println(contato);
    }

    private static void mudar1(Contato contato) {
        /*
         Aqui não vai mudar quando eu mostrar o valor, pois está na memória em uma stack local
         da função. No caso, esse argumento 'contato' é uma cópia que contém a referência para
         a caixa na memória correspondente a variável original que está no main. Então no momento
         que eu instancio um novo Contato, eu perco a referência dessa variável e a nova instância
         fica apenas no escopo dessa função, pois eu não estou retornando.
         No método mudar2 funciona pois eu tendo a referência da caixa na memória, consigo acessar
         a instancia do objeto e modificar o valor lá, o que vai refletir na mudança do sysout lá
         no método main, pois mesmo sendo uma cópia (estilo o tipo valor), se eu acessar a caixa
         pela referência e mudar o valor pelo meu método setName, a mudança vai ficar permanente.

         Em outras palavras, contato é uma cópia da referência do objeto, então se atribuir um novo
         endereço de memória não vai ter reflexo da mudança quando for mostrar no main, mas quando
         alterado o valor na própria referência, vai ser afetado no HEAP e a mudança vai aparecer
         lá no main
        */
        contato = new Contato("Mudança", 84);
    }

    private static void mudar2(Contato contato) {
        contato.setNome("Editado");
    }
}
