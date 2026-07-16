package exercicios.aula4interface.ex1;

public class ConversaoMoeda implements ConversaoFinanceira{

    final double COTACAO_DOLAR = 5.09;

    @Override
    public void converterDolarParaReal(double valorDolar) {
        System.out.println("Dolar: " + valorDolar + " - Real: " + valorDolar * COTACAO_DOLAR);
    }

}
