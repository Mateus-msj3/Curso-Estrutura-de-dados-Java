package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Vetor;
import com.estrutura.de.dados.vetor.VetorObjetos;

public class TesteVetorAula10 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "conato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "1111-2222", "conato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "0000-1111", "conato3@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int posicao = vetor.busca(c1);

        if (posicao > -1) {
            System.out.println("Elemento Existe no vetor!");
        } else {
            System.out.println("Elemento não existe no vetor!");
        }

        System.out.println(vetor);

    }
}
