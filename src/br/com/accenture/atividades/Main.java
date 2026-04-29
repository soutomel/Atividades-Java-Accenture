package br.com.accenture.atividades;

public class Main {
    public static void main(String[] args) {

        Casa casa = new Casa();
        casa.endereco = "Rua das Flores";
        casa.numero = 123;

        Carro carro = new Carro();
        carro.modelo = "Fusca";

        Arvore arvore = new Arvore();
        arvore.especie = "Mangueira";
        arvore.altura = 3.5;

        Joao joao = new Joao();
        joao.casa = casa;
        joao.carro = carro;

        casa.exibirDetalhes();
        carro.ligar();
        arvore.crescer();
        joao.morar();
        joao.dirigir();
    }
}