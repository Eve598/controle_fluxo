import java.util.Scanner;


public class Mensalidade_02 {
    public static void main(String[] args) {

        int nivel_aluno;
        
        double nivel_01 = 51.50;
        
        double nivel_02 = 65.00;
        
        double nivel_03 = 80.00;
        
        double nivel_04 = 100.00;
        
        int data;
        
        double desconto;
        
        double valor_final;
        

        Scanner ler =  new Scanner(System.in);
        

        System.out.println("Digite o nivel do aluno de 1 a 4: ");
        
        nivel_aluno = ler.nextInt();
        

        switch (nivel_aluno) {

            case 1:
                System.out.println("digite o dia de pagamento da mensalidade: ");
                
                data = ler.nextInt();
                

                if (data == 1) {
                    desconto = nivel_01 * 0.15;
                    
                    valor_final = nivel_01 - desconto;
                    
                    System.out.println("Nivel 1 pago no dia primeiro \nvalor atual: "+nivel_01+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } else if (data >= 2 && data <= 5) {
                    desconto = nivel_01 * 0.10;
                    
                    valor_final = nivel_01 - desconto;
                    
                    System.out.println("Nivel 1 pago até o dia cinco \nvalor atual: "+nivel_01+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } else if (data >= 6 && data <= 10) {
                    desconto = nivel_01 * 0.05;
                    
                    valor_final = nivel_01 - desconto;
                    
                    System.out.println("Nivel 1 pago até o dia dez \nvalor atual: "+nivel_01+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } else{
                    System.out.println("seu boleto venceu");
                    
                }
                break;
                

            case 2:
                System.out.println("digite o dia de pagamento da mensalidade: ");
                
                data = ler.nextInt();
                

                if (data == 1) {
                    desconto = nivel_02 * 0.15;
                    
                    valor_final = nivel_02 - desconto;
                    
                    System.out.println("Nivel 2 pago no dia primeiro \nvalor atual: "+nivel_02+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else if (data >= 2 && data <= 5) {
                    desconto = nivel_02 * 0.10;
                    
                    valor_final = nivel_02 - desconto;
                    
                    System.out.println("Nivel 2 pago até o dia cinco \nvalor atual: "+nivel_02+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else if (data >= 6 && data <= 10) {
                    desconto = nivel_02 * 0.05;
                    
                    valor_final = nivel_02 - desconto;
                    
                    System.out.println("Nivel 2 pago até o dia dez \nvalor atual: "+nivel_02+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else{
                    System.out.println("seu boleto venceu");
                    
                }
                break;
                

            case 3:
                System.out.println("digite o dia de pagamento da mensalidade: ");
                
                data = ler.nextInt();
                

                if (data == 1) {
                    desconto = nivel_03 * 0.15;
                    
                    valor_final = nivel_03 - desconto;
                    
                    System.out.println("Nivel 3 pago no dia primeiro \nvalor atual: "+nivel_03+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else if (data >= 2 && data <= 5) {
                    desconto = nivel_03 * 0.10;
                    
                    valor_final = nivel_03 - desconto;
                    
                    System.out.println("Nivel 3 pago até o dia cinco \nvalor atual: "+nivel_03+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else if (data >= 6 && data <= 10) {
                    desconto = nivel_03 * 0.05;
                    
                    valor_final = nivel_03 - desconto;
                    
                    System.out.println("Nivel 3 pago até o dia dez \nvalor atual: "+nivel_03+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else{
                    System.out.println("seu boleto venceu");
                    
                }
                break;
                

            case 4:
                System.out.println("digite o dia de pagamento da mensalidade: ");
                
                data = ler.nextInt();
                

                if (data == 1) {
                    desconto = nivel_04 * 0.15;
                    
                    valor_final = nivel_04 - desconto;
                    
                    System.out.println("Nivel 4 pago no dia primeiro \nvalor atual: "+nivel_04+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else if (data >= 2 && data <= 5) {
                    desconto = nivel_04 * 0.10;
                    
                    valor_final = nivel_04 - desconto;
                    
                    System.out.println("Nivel 4 pago até o dia cinco \nvalor atual: "+nivel_04+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else if (data >= 6 && data <= 10) {
                    desconto = nivel_04 * 0.05;
                    
                    valor_final = nivel_04 - desconto;
                    
                    System.out.println("Nivel 4 pago até o dia dez \nvalor atual: "+nivel_04+"\nvalor do desconto: "+desconto+"\nvalor final com o desconto: "+valor_final);
                    
                } 
                else{
                    System.out.println("seu boleto venceu");
                    
                }
                break;
                

            default:
                System.out.println("Nível inválido");
                
        }
    }
}