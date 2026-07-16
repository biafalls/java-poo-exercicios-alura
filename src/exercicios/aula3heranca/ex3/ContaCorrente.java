package exercicios.aula3heranca.ex3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobraTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
