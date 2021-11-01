package com.company;
public class ContaCorrente {
    private int nroConta;
    private double valor;

    public void deposito(double valor){
        this.valor += valor;
    }

    public void retirada(double valor){
        this.valor -= valor;
    }

    public double getSaldo(){
        return this.valor;
    }

    public int getNroConta(){
        return this.nroConta;
    }

    //Criação de contructor

    //public ContaCorrente();






}