package exercicios.aula4interface.ex4;

public interface ConversorTemperatura {
    /*4.Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
    Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão
    e exibe os resultados.*/

    void celsiusParaFahrenheit(double tempCelsius);
    void fahrenheitParaCelsius(double tempFahrenheit);
}
