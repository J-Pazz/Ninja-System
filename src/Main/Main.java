package Main;

import java.util.Scanner;
import model.Ninja;
import service.NinjaService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TESTE NINJA =====");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Nível: ");
        String hokage = sc.nextLine();

        Ninja ninja = new Ninja(nome, idade, hokage);

        NinjaService service = new NinjaService();

        if (service.isApto(ninja)) {
            System.out.println("\n" + nome + " está APTO para ser ninja! 🥷");
        } else {
            System.out.println("\n" + nome + " NÃO está apto.");
        }

        sc.close();
    }
}