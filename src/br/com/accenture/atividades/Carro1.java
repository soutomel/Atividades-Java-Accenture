package br.com.accenture.atividades;

public class Carro1 {

    String marca;
    int CodigoCor;
    double preco;
    
    boolean ligado = false;
    boolean emMovimento = false;

    public Carro1(String marca, int CodigoCor, double preco) {
        this.marca = marca;
        this.CodigoCor = CodigoCor;
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Código da Cor: " + CodigoCor);
        System.out.println("Preço: R$ " + preco);
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro está ligado.");
    }


    public void movimentar() {
        if (ligado) { 
            this.emMovimento = true;
            System.out.println("O carro está em movimento.");
        } else {
            System.out.println("Erro: Ligue o carro antes de andar!");
        }
    }

    public void buzinar() {
        if (emMovimento) { 
            System.out.println("emitir som");
        } else {
            System.out.println("Erro: O carro precisa estar andando para buzinar.");
        }
    }
}