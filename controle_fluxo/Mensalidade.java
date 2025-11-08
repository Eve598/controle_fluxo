import java.util.Scanner;


public class Mensalidade {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);



        double nivel_01 = 51.50;

        double nivel_02 = 65.00;

        double nivel_03 = 80.00;

        double nivel_04 = 100.00;


        System.out.println("===== SISTEMA DE DESCONTO DE MENSALIDADES =====");


        System.out.println("Níveis disponíveis:");

        
        System.out.println("1 - Nível 1 (R$51,50)");

        System.out.println("2 - Nível 2 (R$65,00)");

        System.out.println("3 - Nível 3 (R$80,00)");

        System.out.println("4 - Nível 4 (R$100,00)");

        System.out.println("===============================================");

        System.out.print("Digite o nível do aluno (1 a 4): ");

        int nivel_aluno = ler.nextInt();


        double valorMensalidade = 0;


        // Define o valor com base no nível
        switch (nivel_aluno) {
            case 1:
                valorMensalidade = nivel_01;

                break;

            case 2:
                valorMensalidade = nivel_02;

                break;

            case 3:
                valorMensalidade = nivel_03;

                break;

            case 4:
                valorMensalidade = nivel_04;

                break;

            default:
                System.out.println("Nível inválido! Encerrando o programa.");

                ler.close();

                return;

        }


        System.out.print("Digite o dia do pagamento da mensalidade: ");

        int data = ler.nextInt();


        double desconto = 0;

        double valorFinal = valorMensalidade;


  
        if (data == 1) {
            desconto = valorMensalidade * 0.15;

            valorFinal -= desconto;

            System.out.println("\n Pagamento realizado no dia 1 (15% de desconto)");

        } else if (data >= 2 && data <= 5) {
            desconto = valorMensalidade * 0.10;

            valorFinal -= desconto;

            System.out.println("\n Pagamento até o dia 5 (10% de desconto)");

        } else if (data >= 6 && data <= 10) {
            desconto = valorMensalidade * 0.05;

            valorFinal -= desconto;

            System.out.println("\n Pagamento até o dia 10 (5% de desconto)");

        } else {
            System.out.println("\n Seu boleto venceu. Nenhum desconto aplicado.");

        }


        System.out.println("\n===== RESUMO DO PAGAMENTO =====");

        System.out.printf("Nível escolhido: %d%n", nivel_aluno);

        System.out.printf("Valor original: R$ %.2f%n", valorMensalidade);

        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);

        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        System.out.println("===============================");


        ler.close();

    }
}
