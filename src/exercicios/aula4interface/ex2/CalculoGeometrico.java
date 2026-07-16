package exercicios.aula4interface.ex2;

public interface CalculoGeometrico {
    /*2.Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
    calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
    A classe deve receber altura e largura como parâmetros.*/

    void calcularArea(double altura, double largura);
    void calcularPerimetro(double altura, double largura);
}
