package exercicios.aula1conceitosfundamentais;

public class Carro {
    /*4.Crie uma classe Carro com atributos modelo, ano, cor e métodos para
    exibir a ficha técnica e calcular a idade do carro.*/
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Modelo: " +modelo);
        System.out.println("Ano: " +ano);
        System.out.println("Cor: " +cor);
    }

    int calculaIdadeCarro() {
        return 2026 - ano;
    }
}
