package edu.zzeis;

public class Main {
    public static void main(String[] args) {
       

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(6, 6);
        Calculadora.subtracao(10, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(18);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1250, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1250, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1250, 5);
    }
}
