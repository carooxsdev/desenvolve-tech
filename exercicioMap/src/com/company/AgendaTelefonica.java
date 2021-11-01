package com.company;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica{
    Map<String,String> agenda = new HashMap<>();

    public void inserir(String nome, String numero){
        //inserir nome e número em agenda

        agenda.put(nome, numero);
    }

    public String buscarNumero(String nome){
      return  agenda.get(nome);

    }

    public void remover(String nome){
        if (buscarNumero(nome)!= null){
            agenda.remove(nome);

        }
    }

    public int tamanho(){
        return agenda.size();
    }






//    --- -<< mapa
//    --- -x
//    --- -x
//    ---   -x
//    ---
//    ---
}
