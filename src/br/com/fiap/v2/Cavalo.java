package br.com.fiap.v2;

public class Cavalo {
    private int id;
    private int posicao;

    public int correr() {
        posicao += Math.random() *6;
        return posicao;
    }
}
