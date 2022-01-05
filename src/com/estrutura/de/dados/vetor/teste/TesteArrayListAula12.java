package com.estrutura.de.dados.vetor.teste;

import java.util.ArrayList;

public class TesteArrayListAula12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        //Metódo adiciona que equivale ao que fiz no vetor
        arrayList.add("A");
        arrayList.add("C");
        System.out.println("Adiciona: " + arrayList);

        //Metódo que adiciona por posição
        arrayList.add(1, "B");
        System.out.println("Adiciona por posição: " + arrayList);

        //Metódo de busca
        boolean existe = arrayList.contains("D");
        if (existe) {
            System.out.println("Busca: " + "Elemento existe no array");
        }else {
            System.out.println("Busca: " + "Elemento não existe no array");
        }

        //Metódo de busca por posição
        System.out.println("Busca por posição: " + arrayList.get(2));

        //Metódo que verifica se o elemento existe no array
        int posicao = arrayList.indexOf("B");
        if (posicao > -1) {
            System.out.println("Contém?: " + "Elemento existe no array na posição " + posicao);
        }else {
            System.out.println("Contém?: " + "Elemento não existe no array, posição " + posicao);
        }

        //Metódo de remoção
        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);

        //Metódo que retorna o tamanho do array
        System.out.println("Tamanho: " + arrayList.size());


    }
}
