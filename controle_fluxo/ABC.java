import java.util.Scanner;

public class ABC.java {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma letra (A, B ou C): ");
        String letra = ler.next().toUpperCase();

        switch (letra) {
            case "A":
                System.out.println("Você digitou a letra A");
                break;
            case "B":
                System.out.println("Você digitou a letra B");
                break;
            case "C":
                System.out.println("Você digitou a letra C");
                break;
            default:
                System.out.println("Letra inválida! Digite apenas A, B ou C.");
                break;
        }

        ler.close();
    }
}
