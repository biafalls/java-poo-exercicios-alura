package exercicios.aula4interface.ex6;

public interface Vendavel {
    /*6.Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
    comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a
    sua própria lógica de cálculo de preço.*/

    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentual);
}
