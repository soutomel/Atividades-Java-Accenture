package br.com.accenture.atividades;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean achou = false;
        int posicaoAchada = -1; // Variável pra corrigir o bug

        System.out.print("Qual número você deseja procurar no vetor? ");
        int numeroProcurado = leitor.nextInt();

        for (int i = 0; i < 10; i++) {
            if (vetor[i] == numeroProcurado) {
                achou = true;
                posicaoAchada = i;
                break;
            }
        }

        if (achou) {
            System.out.println("Achei!");
            System.out.printf("O número %d está na posição %d.%n", numeroProcurado, posicaoAchada);
        } else {
            System.out.println("Número não encontrado no vetor.");
        }

        leitor.close();
    }
}