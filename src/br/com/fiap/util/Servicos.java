package br.com.fiap.util;

public class Servicos {
    public static String mostrarProgresso(int n) {
        String barra = "";
        for (int i = 0; i < n; i ++){
            barra +=  ".";
        }
        String chegada = "|";
        for (int i =0; i < 100 - n; i++) {
            chegada = "  " + chegada;
        }
        return barra + "\uD800\uDC83" + chegada;
    }
}
