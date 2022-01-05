package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Vetor;

public class TesteVetorAula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

    }
}
