
import java.util.Scanner;

public class Idade_oq {
    public static void main(String[] args) {
        int idade;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();

       if(idade >= 0 && idade <= 10){
        System.out.println("Você é infantil");
       } else if (idade >= 11 && idade <= 15){
        System.out.println("Você é juvenil");
       } else if (idade >= 16 && idade <= 18){
        System.out.println("Você é adulto");
       }else{
        System.out.println("VOCÊ É UM ADULTO PRO MAX PREMIUM");
       }
    }
}
