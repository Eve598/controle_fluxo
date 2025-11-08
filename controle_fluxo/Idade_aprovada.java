
import java.util.Scanner;

public class Idade_aprovada{
    public static void main(String[]args) {
        int idade;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a idade da candidata: ");
        idade = ler.nextInt();

        if(idade == 16){
            System.out.println("Aprovada!!");
        } else {
            System.out.println("Reprovada!!");
        }
    }
}