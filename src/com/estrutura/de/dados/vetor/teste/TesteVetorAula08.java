package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Vetor;

public class TesteVetorAula08 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

    }
}