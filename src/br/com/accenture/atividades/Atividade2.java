package br.com.accenture.atividades;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble(); 
        
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        //menu
        System.out.println("\n--- MENU DE OPERAÇÕES ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt(); 
        
        
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Opção inválida!"); 
        }

        input.close();
    }
}