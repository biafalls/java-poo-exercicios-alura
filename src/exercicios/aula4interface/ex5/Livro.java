package exercicios.aula4interface.ex5;

public class Livro implements Calculavel{
    private String titulo;
    private double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco *= 0.9;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
