package Main;

import java.util.Scanner;

import model.Ninja;
import Missao.Missao;
import service.NinjaService;
import service.NivelService;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TESTE NINJA =====");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Você é um Genin? (sim/nao): ");
        String genin = sc.nextLine();

        Ninja ninja = new Ninja(nome, idade, genin);

        NinjaService ninjaService = new NinjaService();

        if (ninjaService.isApto(ninja)) {
            System.out.println("\n" + nome + " está APTO para ser ninja! 🥷");
        } else {
            System.out.println("\n" + nome + " NÃO está apto.");
        }

        // ===== SISTEMA DE MISSÕES =====

        NivelService missaoService = new NivelService();
        NivelService nivelService = new NivelService();

        System.out.print("\nQuantas missões você fez? ");
        int qtdMissoes = sc.nextInt();
        sc.nextLine();

        int pontosTotal = 0;

        for (int i = 1; i <= qtdMissoes; i++) {

            System.out.println("\n--- Missão " + i + " ---");

            System.out.print("Nome da missão: ");
            String nomeMissao = sc.nextLine();

            System.out.print("Dificuldade (1 a 10): ");
            int dificuldade = sc.nextInt();
            sc.nextLine();

            System.out.print("Concluída? (verdadeiro/falso): ");
            boolean concluida = sc.nextBoolean();
            sc.nextLine();

            Missao missao = new Missao(nomeMissao, dificuldade, concluida);

            int pontos = missaoService.calcularPontos(missao);
            pontosTotal += pontos;

            System.out.println("Pontos dessa missão: " + pontos);
        }

        System.out.println("\n//RESULTADO FINAL//");
        System.out.println("Pontos totais: " + pontosTotal);

        int nivelAtual = 1;
        int novoNivel = ninjaService.subirNivel(nivelAtual, pontosTotal);

        System.out.println("Seu nível atual era: " + nivelAtual);
        System.out.println("Seu novo nível é: " + novoNivel);

        sc.close();
    }
}