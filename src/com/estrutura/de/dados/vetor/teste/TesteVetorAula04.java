package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Vetor;

public class TesteVetorAula04 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento");
        vetor.adiciona("elemento2");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }
}
