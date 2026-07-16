package exercicios.aula4interface.ex5;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private double preco;
    private boolean importado;
    final double TAXA_IMPORTACAO = 1.08;
    final double TAXA = 0.08;

    @Override
    public double calcularPrecoFinal() {
        if (importado == true){
            return preco *= TAXA_IMPORTACAO;
        } else {
            return preco *= TAXA;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }
}
