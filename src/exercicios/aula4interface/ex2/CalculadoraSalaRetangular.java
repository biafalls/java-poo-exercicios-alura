package exercicios.aula4interface.ex2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("A área da sala retangular é: " + altura * largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("O perimetro da sala retangular é: " + 2 * (altura + largura));
    }

}
