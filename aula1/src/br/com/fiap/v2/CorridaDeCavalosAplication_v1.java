package br.com.fiap.v2;

import br.com.fiap.util.Servicos;

public class CorridaDeCavalosAplication_v1 {
    public static void main(String[] args) {
        Cavalo cv1 = new Cavalo();
        System.out.println(cv1.correr());
        System.out.println(Servicos.mostrarProgresso(5));
    }
}
