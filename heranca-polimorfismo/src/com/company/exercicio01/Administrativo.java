package com.company.exercicio01;

public class Administrativo extends Assistente {
    private double bonusNoturno = 500;
    private String turno = "dia";

    public Administrativo(String nome, String cpf, double salario, int matricula, String turno) {
        super(nome, cpf, salario, matricula);
        this.turno  = turno;
        if( turno == "noite"){
            setSalario(salario + bonusNoturno);
        }
    }
}
