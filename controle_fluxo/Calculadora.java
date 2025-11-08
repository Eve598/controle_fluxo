import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double numero1, numero2, total;
        String op;

        System.out.print("Digite o primeiro número: ");
        numero1 = in.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        op = in.next();

        System.out.print("Digite o segundo número: ");
        numero2 = in.nextDouble();

        if (op.equals("+")) {
            total = numero1 + numero2;
            System.out.println("Resultado: " + total);
        } else if (op.equals("-")) {
            total = numero1 - numero2;
            System.out.println("Resultado: " + total);
        } else if (op.equals("*")) {
            total = numero1 * numero2;
            System.out.println("Resultado: " + total);
        } else if (op.equals("/")) {
            if (numero2 != 0) {
                total = numero1 / numero2;
                System.out.println("Resultado: " + total);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operador inválido!");
        }

        in.close();
    }
}