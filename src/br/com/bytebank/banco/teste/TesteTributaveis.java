package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2222, 333);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();

        CalculadorImposto cal = new CalculadorImposto();
        cal.registra(cc);
        cal.registra(seguro);

        System.out.println(cal.getTotalImposto());

    }
}
