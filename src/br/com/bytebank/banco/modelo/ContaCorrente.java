package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia,numero);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
    @Override
    public void saca(double valor){
        double valoraSacar = valor + 0.2;
        super.saca(valoraSacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "CC" + " "+ super.toString();
    }
}
