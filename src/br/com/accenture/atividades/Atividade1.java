package br.com.accenture.atividades;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos ingressos da Classe A foram vendidos?");
		int qtdA = input.nextInt();

		System.out.println("Quantos ingressos da Classe B foram vendidos?");
		int qtdB = input.nextInt();

		System.out.println("Quantos ingressos da Classe C foram vendidos?");
		int qtdC = input.nextInt();
		
		double rendaTotal = (qtdA * 50) + (qtdB * 30) + (qtdC * 20);
		System.out.println("A renda total gerada pela venda dos ingressos é: R$ " + rendaTotal);
		
		input.close();
	}
}
