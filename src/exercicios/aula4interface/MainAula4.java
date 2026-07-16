package exercicios.aula4interface;

import exercicios.aula4interface.ex1.ConversaoMoeda;
import exercicios.aula4interface.ex2.CalculadoraSalaRetangular;
import exercicios.aula4interface.ex3.TabuadaMultiplicacao;
import exercicios.aula4interface.ex4.ConversorTemperaturaPadrao;
import exercicios.aula4interface.ex5.Livro;
import exercicios.aula4interface.ex5.ProdutoFisico;
import exercicios.aula4interface.ex6.Produto;
import exercicios.aula4interface.ex6.Servico;

public class MainAula4 {
    public static void main(String[] args) {
        //ex1
        System.out.println("\n---- Convertendo Dolares em Reais ------");
        ConversaoMoeda conversao = new ConversaoMoeda();
        conversao.converterDolarParaReal(220.5);

        //ex2
        System.out.println("\n---- Calculo Geométrico ------");
        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
        salaRetangular.calcularArea(34,55);
        salaRetangular.calcularPerimetro(34,55);

        //ex3
        TabuadaMultiplicacao multiplicacao = new TabuadaMultiplicacao();
        multiplicacao.mostrarTabuada(32);

        //ex4
        System.out.println("\n---- Conversor de Temperaturas ------");
        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        conversorTemp.celsiusParaFahrenheit(38);
        conversorTemp.fahrenheitParaCelsius(100.4);

        //ex5
        System.out.println("\n---- Preços Livro e Produto Físico ------");
        Livro livro = new Livro();
        livro.setTitulo("Panchinko");
        livro.setPreco(79.90);
        System.out.println("Titulo Livro: " + livro.getTitulo());
        System.out.println("Preço Livro: " + livro.getPreco());
        System.out.println("Preco final:  " + livro.calcularPrecoFinal());

        ProdutoFisico gloss = new ProdutoFisico();
        gloss.setNome("Gloss da Rihanna");
        gloss.setPreco(198.99);
        gloss.setImportado(true);
        System.out.println("Nome : " + gloss.getNome());
        System.out.println("Preço Produto: " + gloss.getPreco());
        System.out.println("Preco final:  " + gloss.calcularPrecoFinal());

        //ex6
        System.out.println("\n---- Preços Produtos e Serviços------");
        Produto produto = new Produto("Teclado", 150);
        System.out.println("Preço total: R$ " + produto.calcularPrecoTotal(2));
        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto: R$ " + produto.getPreco());

        System.out.println();

        Servico servico = new Servico("Manutenção", 80);
        System.out.println("Preço total: R$ " + servico.calcularPrecoTotal(3));
        servico.aplicarDesconto(20);
        System.out.println("Valor por hora com desconto: R$ " + servico.getValorHora());

    }
}
