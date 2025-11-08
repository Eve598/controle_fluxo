import java.util.Scanner;

public class Voce_e {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número (1 ou 2): ");
        int n = ler.nextInt();

        System.out.print("Digite o seu ano de nascimento: ");
        int ano = ler.nextInt();

        switch (n) {
            case 1:
                int idade = 2025 - ano;
                if (idade >= 40) {
                    System.out.println("Você é quarentão ");
                } else if (idade >= 20) {
                    System.out.println("Você é jovem adulto ");
                } else {
                    System.out.println("Você ainda é novinho ");
                }
                break;

            case 2:
                System.out.println("Você digitou o número 2");
                break;

            default:
                System.out.println("Valor inválido! Digite 1 ou 2.");
                break;
        }

        ler.close();
    }
}

