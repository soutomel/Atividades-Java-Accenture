package br.com.accenture.atividades;

public class PrincipalAnimais {

    public static void main(String[] args) {
        
        Gato meuGato = new Gato("Mingau", 3);
        Dog meuDog = new Dog("Lulu", 2);
        
        System.out.print("O Gato faz: ");
        meuGato.emitirSom(); 

        System.out.print("O Dog faz: ");
        meuDog.emitirSom(); 
    }
}