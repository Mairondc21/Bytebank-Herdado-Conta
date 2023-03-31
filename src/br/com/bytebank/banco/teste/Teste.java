package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.Conta;

public class Teste {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(21,23);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(123,456);
        guardador.adiciona(cc2);


        Conta ref = (Conta) guardador.getReferencia(1);

        System.out.println(guardador.tamanho());
        System.out.println(ref.getSaldo());
    }
}
