package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Vetor;

public class TesteVetorAula06 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de Dados");

        System.out.print("Busca elemento 'Estrutura de Dados': ");
        System.out.println(vetor.busca("Estrutura de Dados"));

        System.out.print("Busca elemento 'loiane.traning': ");
        System.out.println(vetor.busca("loiane.traning"));

    }
}
