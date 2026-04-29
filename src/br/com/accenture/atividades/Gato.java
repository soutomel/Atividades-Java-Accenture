package br.com.accenture.atividades;

public class Gato {

    String nome;
    int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Miau! Miau!");
    }
}