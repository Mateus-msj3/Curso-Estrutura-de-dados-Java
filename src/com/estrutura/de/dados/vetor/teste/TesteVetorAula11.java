package com.estrutura.de.dados.vetor.teste;

import com.estrutura.de.dados.vetor.Lista;

public class TesteVetorAula11 {

    public static void main(String[] args) {

        Lista<String> vetor = new Lista<String>(1);

        vetor.adiciona("Elemento");

        System.out.println(vetor);
    }
}
