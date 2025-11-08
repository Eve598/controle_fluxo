
import java.util.Scanner;

public class Idade_candidata {
    public static void main(String[]args) {
        int idade;
        double altura;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a idade da candidata: ");
        idade = ler.nextInt();
        System.out.println("Digite a altura da candidata: ");
        altura = ler.nextInt();

        if(idade == 16 && idade <= 18 && altura >=1.60 && altura <= 1.80){
            System.out.println("aprovada!!");
        } else {
            System.out.println("reprovado");
        }
            
        
    }
}