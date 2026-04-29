package br.com.accenture.atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade3Part3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saoPares = 0;
        ArrayList<Integer> numerosPares = new ArrayList<>();
        
        System.out.print("Quantos números você deseja digitar: ");
        int quantidadeDeNumeros = input.nextInt();
        
        int[] numeros = new int[quantidadeDeNumeros];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Entre com a posição %d: ", i + 1);
            numeros[i] = input.nextInt();
            
            if (numeros[i] % 2 == 0) {
                saoPares++;
                numerosPares.add(numeros[i]);
            }
        }
        
        System.out.println();

        String msgNumeros = (numeros.length == 1) ? "O número digitado é: " : "Os números digitados são: ";
        System.out.println(msgNumeros + Arrays.toString(numeros));

        String msgQtdPares = (saoPares == 1) ? 
            "A quantidade de numeros pares é " + saoPares + "." : 
            "Desses números apenas " + saoPares + " são pares.";
        System.out.println(msgQtdPares);

        String msgListaPares = (saoPares == 1) ? 
            numerosPares + " é um numero par" : 
            "Os numeros pares são: " + numerosPares;
        System.out.println(msgListaPares);

        input.close();
    }
}