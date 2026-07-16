package exercicios.aula4interface.ex6;

public class Produto implements Vendavel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
