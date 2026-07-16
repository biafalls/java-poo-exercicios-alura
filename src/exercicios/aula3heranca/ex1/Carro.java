package exercicios.aula3heranca.ex1;

public class Carro {
    /*1.Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente
    métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
    Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir
    preços e mostrar informações.*/
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void defineModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void definePrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibeInformacoes() {
        System.out.println("===== Carro ======");
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}
