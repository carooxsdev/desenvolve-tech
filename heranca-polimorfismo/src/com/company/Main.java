package com.company;

import com.company.exercicio01.Administrativo;
import com.company.exercicio01.Assistente;
import com.company.exercicio01.Funcionario;
import com.company.exercicio01.Tecnico;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carolina", "02302302322", 50000.0);
        Assistente assistente = new Assistente("Carolsss", "02102102122", 80000.00, 00001);
        Tecnico tecnico = new Tecnico("Carooxs", "02002002022", 10000,1001);
        Administrativo administrativo = new Administrativo("Caroloooxxx", "02402402422", 100000, 1002, "noite");
        System.out.println("*-------------Dados de Funcionário---------------*");
        funcionario.exibeDados();
        System.out.println("*-------------Assistente-------------------------*");
        assistente.exibeDados();
        System.out.println("*-------------Tecnico----------------------------*");
        tecnico.exibeDados();
        System.out.println("*-------------Administrativo----------------------*");
        administrativo.exibeDados();
    }

}
