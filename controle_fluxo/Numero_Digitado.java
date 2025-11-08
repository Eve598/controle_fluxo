
import java.util.Scanner;

public class numero_Digitado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número (1, 2 ou outro): ");
        int n = ler.nextInt();

        switch (n) {
            case 1:
                System.out.println("Você digitou o número 1");
                break;
            case 2:
                System.out.println("Você digitou o número 2");
                break;
            default:
                System.out.println("Número inválido! Digite apenas 1 ou 2.");
                break;
        }

        ler.close();
    }
}
