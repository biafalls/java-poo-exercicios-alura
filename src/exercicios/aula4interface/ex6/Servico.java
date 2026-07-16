package exercicios.aula4interface.ex6;

public class Servico implements Vendavel {
    private String descricao;
    private double valorHora;

    public Servico(String descricao, double valorHora) {
        this.descricao = descricao;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return valorHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {

        if (percentual > 30) {
            percentual = 30;
        }

        valorHora -= valorHora * (percentual / 100);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorHora() {
        return valorHora;
    }
}
