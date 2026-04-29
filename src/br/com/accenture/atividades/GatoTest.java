package br.com.accenture.atividades;

public class GatoTest {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Mingau", 3);
        
        System.out.println("Nome: " + meuGato.nome);
        System.out.println("Idade: " + meuGato.idade);
        meuGato.emitirSom();
    }
}