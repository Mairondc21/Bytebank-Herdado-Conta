package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteExeption extends RuntimeException{

    public SaldoInsuficienteExeption(String msg){
        super(msg);
    }
}
