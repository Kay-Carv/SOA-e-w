package br.com.fiap;

import java.util.Random;
import java.util.Scanner;

public class CorridaDeCavalosApplications_v0_1 {
    public static void main(String[] args) throws InterruptedException {
        //Recursos
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //instanciar o número int aleaório

        //Variáveis globais
        int[] posicaoCavalo = new int[6];
        for (int i = 0; i < posicaoCavalo.length; i ++){
            posicaoCavalo[i] = 0;
        }
        int passos = 0;

        //Saudação
        System.out.println("Nessa corrida, 6 cavalos estão competindo.");
        System.out.println("Bem vindo a nossa corrida de cavalo!! " +
                "\nEscolha o seu cavalo (1 a 6) e se divirta :)");

        //Coletar a aposta
        int aposta = coletarAposta(scanner);

        //Jogo dos cavalos
        System.out.println("Tecle \"Enter\" para iniciar o jogo!!!");
        scanner.nextLine();
        while (posicaoCavalo[0]  < 100 &&
                posicaoCavalo[1] < 100 &&
                posicaoCavalo[2] < 100 &&
                posicaoCavalo[3] < 100 &&
                posicaoCavalo[4] < 100 &&
                posicaoCavalo[5] < 100) {

            passos ++;
            for (int i = 0; i < posicaoCavalo.length; i ++){
                posicaoCavalo[i] += random.nextInt(6) + 1;
                System.out.println("Posição cavalo " + (i + 1) + ": "+ mostrarProgresso(posicaoCavalo[i]));
            }

            if (passos == 10) {
                System.out.println("Você gostaria de mudar a aposta?? 😈 (sim/nao)");
                String mudar = scanner.nextLine();
                if (mudar.equalsIgnoreCase("sim")) {
                    aposta = coletarAposta(scanner);
                }
            }

            System.out.println();
            Thread.sleep(500);
        }

        int indexVencedor = 0;
        for (int i = 0; i < posicaoCavalo.length; i++) {
            if (posicaoCavalo[indexVencedor] < posicaoCavalo[i]) {
                indexVencedor = i;
            }
        }

        int cavaloVencedor = indexVencedor + 1; // Cria uma variável para a matemática funcionar

        //RESULTADO DO JOGO
        System.out.println("Cavalo vencedor: " + cavaloVencedor);
        if (aposta == cavaloVencedor) {
            System.out.println("VOCÊ GANHOU 🥳👏🍾🎉🏆🏆🏆");
        } else {
            System.out.println("PERDEU OTÁRIO PASSA TODA A SUA GRANA PRO CASSINO!!");
        }
        //FIM
        System.out.println("Fim de jogo! :)");
        scanner.close();
    }

    //funções
    public static int coletarAposta(Scanner scanner) {
        //Coleta da aposta
        System.out.print("Digite o número do cavalo: ");
        int aposta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Você apostou no cavalo: " + aposta);

        return aposta;
    }

    public static String mostrarProgresso(int n) {
        String barra = "";
        for (int i = 0; i < n; i ++){
            barra += ".";
        }
        String chegada = "|";
        for (int i =0; i < 100 - n; i++) {
            chegada = " " + chegada;
        }
        return barra + "\uD800\uDC83" + chegada;
    }
}

