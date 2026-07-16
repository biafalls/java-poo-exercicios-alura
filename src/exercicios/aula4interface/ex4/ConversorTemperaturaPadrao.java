package exercicios.aula4interface.ex4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double tempCelsius) {
        double fahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double tempFahrenheit) {
        double celsius = (tempFahrenheit - 32) * 5 / 9;
        System.out.println("Temperatura em Celsius: " + celsius);
    }
}
