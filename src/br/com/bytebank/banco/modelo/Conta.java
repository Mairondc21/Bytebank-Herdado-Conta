package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * @author Mairon
 */
public abstract class Conta implements Comparable<Conta>{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para iniciar o objeto Conta informando seus parametros, agencia e numero de uma conta
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é " + br.modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta" + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor){

        if (this.saldo < valor) {
            throw new SaldoInsuficienteExeption("erro");
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);

    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref) {

       Conta outro = (Conta) ref;

       if(this.agencia != outro.agencia){
           return false;
       }
       if (this.numero != outro.numero){
           return false;
       }
       return true;
    }

    @Override
    public int compareTo(Conta outro) {
        return Double.compare(this.saldo, outro.saldo);
    }

    @Override
    public String toString() {
        return "agencia :" + this.agencia + " numero: " + this.numero + " saldo " + this.saldo;
    }
}