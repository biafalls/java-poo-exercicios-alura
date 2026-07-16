package exercicios.aula4interface.ex3;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int num) {
        System.out.println("\n--- Tabuada do " + num + "---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

}
