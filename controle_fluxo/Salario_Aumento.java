import java.util.Scanner;

public class Salario_Aumento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o do funcionario: R$ ");
        double salario = sc.nextDouble();
        double aumento, Salario2;

        if (salario <= 1000) {
            aumento = salario * 0.40;
        } else {
            aumento = salario * 0.30;
        }

        Salario2 = salario + aumento;

        System.out.println("Salário antigo: R$ " + salario);
        System.out.println("Aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + Salario2);


    }
}