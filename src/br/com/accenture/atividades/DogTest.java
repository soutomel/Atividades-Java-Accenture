package br.com.accenture.atividades;

public class DogTest {
    public static void main(String[] args) {
        Dog meuDog = new Dog("Lulu", 2);
        
        System.out.println("Nome: " + meuDog.nome);
        System.out.println("Idade: " + meuDog.idade);
        meuDog.emitirSom();
    }
}