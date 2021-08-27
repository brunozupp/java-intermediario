package com.noveli.cursojava.aulaanotacao;

// Como não define onde essa anotação seria usada, posso usar ela em qualquer lugar
@InformacaoAula(
        autor = "Bruno",
        aulaNumero = 65,
        blog = "bruno.com"
)
public class Teste {

    @InformacaoAula(
            autor = "Bruno",
            aulaNumero = 65,
            blog = "bruno.com"
    )
    public static void main(String[] args) {

    }
}
