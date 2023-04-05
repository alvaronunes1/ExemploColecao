package br.newton.paiva;

public class ContaCorrente {

    private double saldo;
    public int numero;
    Cliente cliente;

    public void depositar(double valor){

        saldo+=valor;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
