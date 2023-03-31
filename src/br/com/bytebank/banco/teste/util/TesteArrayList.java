package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(22,33);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(11,44);
        lista.add(cc2);

        System.out.println(lista.size());

        lista.get(0);

        for (Conta conta : lista){
            System.out.println(conta);
        }

    }
}
