package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Vetor;

public class TesteVetorAula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de Dados");

        System.out.print("Elemento da posição 0: ");
        System.out.println(vetor.busca(0));

        System.out.print("Elemento da posição 1: ");
        System.out.println(vetor.busca(1));

        System.out.print("Elemento da posição 2: ");
        System.out.println(vetor.busca(2));

    }
}
