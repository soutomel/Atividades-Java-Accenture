package br.com.accenture.atividades;

public class Dog {

    String nome;
    int idade;

    public Dog(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Au! Au!");
    }
}