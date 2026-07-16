package exercicios.aula3heranca;

import exercicios.aula3heranca.ex1.ModeloCarro;
import exercicios.aula3heranca.ex2.Animal;
import exercicios.aula3heranca.ex2.Cachorro;
import exercicios.aula3heranca.ex2.Gato;
import exercicios.aula3heranca.ex3.ContaBancaria;
import exercicios.aula3heranca.ex3.ContaCorrente;
import exercicios.aula3heranca.ex4.GeradorPrimo;
import exercicios.aula3heranca.ex4.NumerosPrimos;
import exercicios.aula3heranca.ex4.VerificadorPrimo;

public class MainAula3 {
    public static void main(String[] args) {
        //ex1
        ModeloCarro carro = new ModeloCarro();
        carro.defineModelo("SUV");
        carro.definePrecos(102990, 115000, 120000);
        carro.exibeInformacoes();

        //ex2
        System.out.println("\n==== Animal ====");
        Animal animal = new Animal();
        animal.emiteSom();

        System.out.println("\n==== Cachorro ====");
        Cachorro cachorro = new Cachorro();
        cachorro.emiteSom();
        cachorro.abanaRabo();

        System.out.println("\n==== Gato ====");
        Gato gato = new Gato();
        gato.emiteSom();
        gato.arranhaMovel();

        //ex3
        System.out.println("\n==== Conta Bancaria ====");
        ContaBancaria conta = new ContaBancaria();
        conta.deposita(1000);
        conta.consultaSaldo();

        System.out.println("\n==== Conta Corrente ====");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposita(200);
        contaCorrente.cobraTarifaMensal();
        contaCorrente.consultaSaldo();
        contaCorrente.saca(150);
        contaCorrente.consultaSaldo();

        //ex4
        System.out.println("\n==== Números Primos ====");
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(1);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(29);
        System.out.println("O próximo primo após 29 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listaPrimos(31);
    }
}

