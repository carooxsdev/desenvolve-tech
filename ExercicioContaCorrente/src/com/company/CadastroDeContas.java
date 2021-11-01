package com.company;
public class CadastroDeContas {
    ContaCorrente[] listConta = new ContaCorrente[10];
    public boolean novaContaCorrente(ContaCorrente c) {
        boolean flag = false;

        if(listConta[listConta.length -1] != null) return false;

        if (c == null) {
           flag = false;
        }

        for (int i =0; i <= listConta.length-1; i++){
            if (listConta[i]== null){
                listConta[i]=c;
                flag = true;
            }
        }
        return flag;
        //criar lista de ContaCorrente
        //se c for null, retorna false
        //se c não for null, adiciona contas na lista e retorna true
    }
    public ContaCorrente getConta(int nroCta){
        ContaCorrente conta = null;
        for(int i=0;i <= listConta.length-1; i++){
            if(listConta[i].getNroConta() == nroCta){
                conta = listConta[i];
            }
        }
        return conta;
    }

    //MODIFICADORES DE ACESSO: PUBLIC, PRIVATE, PACKAGE E PROTECTED
    //RETORNO DO MÉTODO
    //NOME DO MÉTODO
    //PARAMETROS

    //public int qtdContas(double saldoMinimo) {
        //comparar saldo mínimo com listConta
        //procurar a conta dentro de listConta, achando conta, comparar o saldo da conta com saldoMinimo
        //fazer para todas as contas
        //trazer a quantidade de contas

       // saldoMinimo <= listConta    }

    //

}
