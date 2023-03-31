package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;
public class TesteArrayListEquals {
    public static void main(String[] args) {



        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,33);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(44,55);
        lista.add(cc2);

        System.out.println(cc.equals(cc2));

        for (Conta conta : lista){
            System.out.println(conta);
        }

    }
}
