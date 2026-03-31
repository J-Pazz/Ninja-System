package Main;

import java.util.Scanner;

import model.Ninja;
import model.Missao;
import service.NinjaService;
import service.NivelService;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AVALIADOR =====");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Qual o Rank dele(a)?: ");
        String genin = sc.nextLine();

        Ninja ninja = new Ninja(nome, idade, genin);

        NinjaService ninjaService = new NinjaService();

        // ===== SISTEMA DE MISSÕES =====

        NivelService missaoService = new NivelService();
        NivelService nivelService = new NivelService();

        System.out.print("\nQuantas missoes ele(a) fez? ");
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

            int pontos = nivelService.calcularPontos(missao);
            pontosTotal += pontos;

            System.out.println("Pontos dessa missão: " + pontos);
        }

        System.out.println("\n//RESULTADO FINAL//");
        System.out.println("Pontos totais: " + pontosTotal);

        int nivelAtual = 1;
        int novoNivel = nivelService.subirNivel(nivelAtual, pontosTotal);

        System.out.println("Seu nível atual era: " + nivelAtual);
        System.out.println("Seu novo nível é: " + novoNivel);

        String rank = nivelService.definirRank(pontosTotal);

        System.out.println("\n===== RANK DO NINJA =====");
        System.out.println("Pontos totais: " + pontosTotal);
        System.out.println("Seu rank agora é: " + rank);

        sc.close();
    }
}