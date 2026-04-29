package br.com.accenture.atividades;

public class CarroPrincipal {

    public static void main(String[] args) {
        Carro1 meuCarro = new Carro1("Toyota", 10, 85000.0);

        meuCarro.movimentar();
        meuCarro.ligar();
        meuCarro.movimentar();
        meuCarro.buzinar();     
        meuCarro.exibir();
    }
}