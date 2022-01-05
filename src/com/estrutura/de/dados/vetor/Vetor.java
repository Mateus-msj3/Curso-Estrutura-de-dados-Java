package com.estrutura.de.dados.vetor;

public class Vetor {

    private String[] elementos;

    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Adiciona elemento no vetor
    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    // Adiciona elemento em qualquer posição do vetor
    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i-- ) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // Busca um elemento no vetor por determinada posição
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    // Busca se um elemento existe no array com busca sequencial
    public int busca(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    // Obtem o tamanho do Vetor
    public int tamanho() {
        return this.tamanho;
    }

    // Imprime apenas os elementos oucupados no array
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");

        for (int i = 0; i < this.tamanho -1; i++) {
            string.append(this.elementos[i]);
            string.append(", ");
        }

        if (this.tamanho > 0) {
            string.append(this.elementos[this.tamanho -1]);
        }

        string.append("]");

        return string.toString();
    }
}
