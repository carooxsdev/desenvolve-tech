package com.company.exercicio01;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(String nome, String cpf, double salario, int matricula) {
        super(nome, cpf, salario);
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    public void exibeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Salário: " + getSalario());
        System.out.println("Matrícula " + getMatricula());
    }
}
