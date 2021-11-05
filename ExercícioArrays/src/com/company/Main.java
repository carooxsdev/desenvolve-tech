package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Instanciar um arranjo de inteiros com 20 espaços
        int [] arranjo = new int [20];
        int [] arranjoInvertido = new int[20];
        int [] arranjoRepetidos = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6};
        int [] novoArranjo = {1, 2, 3, 4, 5};
        int [] uniao = union(novoArranjo, arranjoRepetidos);

        for(int i = 0; i< uniao.length; i++){
            System.out.print(uniao[i] + ", ");
        }
        System.out.println("União de listas" + Arrays.toString(uniao));
        listRepeat(arranjoRepetidos);
        //hasRepeat(arranjoRepetidos);
        //System.out.println(nroRepeat(arranjoRepetidos));
        //Inicializar cada posição com o valor da posição multiplicado por 10
        for (int i =0; i <= arranjo.length-1; i++) {
            arranjo[i] = i * 10;
            System.out.println(arranjo[i]);
        }
        //printar o array ao contrario

        for(int i = arranjo.length-1; i >=0; i--){
            arranjoInvertido[i] = arranjo[i];
            System.out.println(arranjoInvertido[i]);
        }
// Outra forma de resolução
//        int temp = 0;
//        for(int i = 0; i <= arranjo.length -1; i++){
//            for(int j = 0; j< i; j++){
//                temp = arranjo[i];
//                arranjo[i] = arranjo[j];
//                arranjo[j] = temp;
//            }
//        }
        System.out.println( nOcorrencias(arranjoInvertido, 40));
   }

    public static int nOcorrencias(int[] l, Integer el){

        //passar por toda lista, para verificar o nº de ocorrências.
        int cont =0;
        for(int i =0;i< l.length; i++   ){
            if(l[i]==el){
                cont++;
            }
        }return cont;
    }

    //b. Método que retorna true se l tem elementos repetidos
   // public static boolean hasRepeat(int[] l)

    public static boolean hasRepeat(int[] l){
        //retornar true se l repetido
        // passar pela lista
        boolean retorno = false;

        for(int i=0; i< l.length; i++){

            for(int j=i+1; j<l.length; j++){
                if(l[i] == l[j]){
                    retorno = true;
                }
            }
        }
        System.out.println(retorno);
        return retorno;
    }

    public static int nroRepeat(int[] l){
        int cont = 0;
        for(int i=0; i< l.length; i++){
            for(int j=i+1; j< l.length; j++){
                if(l[i] == l[j]){
                    cont ++;
                }
            }
        } return cont;
    }

    public static int[] listRepeat(int[] l){
        int [] listaRepetidos = new int[l.length];
        int cont =0;
        for(int i=0; i< l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] == l[j]) {
                    //cont++;
                    listaRepetidos [i] = l[j];
                    System.out.println(listaRepetidos[i]);
                }
            }
        }
        return listaRepetidos;
    }

    public static int[] union(int[] l1, int[] l2){
        int [] listaUniao = new int [l1.length + l2.length];
        int cont = 0;
        for (int i = 0; i< l1.length; i++){
            listaUniao[cont]= l1[i];
            cont++;
        }
        for(int i= 0; i< l2.length; i++){
            listaUniao[cont] = l2[i];
            cont++;
        }
        return listaUniao;
    }

    public static int[] intersect(int[] l1, int[] l2) {
        int size = l1.length + l2.length;
        int[] lista = new int[size];
        int contador = 0;
        for (int i = 0; i < l1.length - 1; i++) {
            for (int j = 0; j < l2.length - 1; j++) {
                if (l1[i] == l2[j]) {
                    lista[contador] = l1[i];
                    System.out.println(lista[contador]);
                    contador++;
                }
            }
        }
        return lista;
    }

}


