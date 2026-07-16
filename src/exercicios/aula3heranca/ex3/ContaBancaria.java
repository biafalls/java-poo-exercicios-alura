package exercicios.aula3heranca.ex3;

public class ContaBancaria {
    /*3.Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
     consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um
     método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.*/
    protected double saldo;

    public void deposita(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultaSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
