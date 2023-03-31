package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        ContaPoupanca cp = new ContaPoupanca(111,555);

        System.out.println(cc);
        System.out.println(cp);

        println(cc);
        }
        static void println(Object referencia){

        }

}
