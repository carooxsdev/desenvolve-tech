package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Instanciar um arranjo de inteiros com 20 espaços
        int [] arranjo = new int [20];
        int [] arranjoInvertido = new int[20];
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


}
