package br.com.fiap;

import java.util.Scanner;

public class CorridaDeCavalosApplications_v0 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        //Variáveis globais
        int posicaoCavalo1 = 0;
        int posicaoCavalo2 = 0;
        int posicaoCavalo3 = 0;
        int posicaoCavalo4 = 0;
        int posicaoCavalo5 = 0;
        int posicaoCavalo6 = 0;

        System.out.println("Bem vindo a nossa corrida de cavalo!! " +
                "\nEscolha o seu cavalo e se divirta :)");
        //Coleta da aposta
        int aposta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Você apostou no cavalo: " + aposta);

        System.out.println("Tecle \"Enter\" para iniciar o jogo!!!");
        scanner.nextLine();

        //Jogo dos cavalos
        while (posicaoCavalo1  < 100 ||
                posicaoCavalo2 < 100 ||
                posicaoCavalo3 < 100 ||
                posicaoCavalo4 < 100 ||
                posicaoCavalo5 < 100 ||
                posicaoCavalo6 < 100) {

            posicaoCavalo1 += (int) (Math.random() * 6);
            System.out.println("Posição do cavalo1: " + posicaoCavalo1);
            posicaoCavalo2 += (int) (Math.random() * 6);
            System.out.println("Posição do cavalo2: " + posicaoCavalo2);
            posicaoCavalo3 += (int) (Math.random() * 6);
            System.out.println("Posição do cavalo3: " + posicaoCavalo3);
            posicaoCavalo4 += (int) (Math.random() * 6);
            System.out.println("Posição do cavalo4: " + posicaoCavalo4);
            posicaoCavalo5 += (int) (Math.random() * 6);
            System.out.println("Posição do cavalo5: " + posicaoCavalo5);
            posicaoCavalo6 += (int) (Math.random() * 6);
            System.out.println("Posição do cavalo6: " + posicaoCavalo6);
            System.out.println();
            Thread.sleep(500);
        }

        System.out.println("Fim de jogo! :)");
    }
}
