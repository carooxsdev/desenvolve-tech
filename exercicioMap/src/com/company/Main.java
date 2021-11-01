package com.company;

public class Main {

    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.inserir("vitor", "99999999");

        agenda.inserir("carol", "99988888");

        agenda.inserir("dani", "999777776");

        agenda.inserir("van", "9666666896");

        agenda.inserir("mari", "990200200");

        String numero =  agenda.buscarNumero("mari");

        System.out.println(agenda.tamanho());
        agenda.remover("vitor");
        System.out.println(agenda.tamanho());
        System.out.println(numero);
    }
}
