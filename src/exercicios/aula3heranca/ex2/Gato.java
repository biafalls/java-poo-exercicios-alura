package exercicios.aula3heranca.ex2;

public class Gato extends Animal {
    @Override
    public void emiteSom() {
        System.out.println("Miau");
    }

    public void arranhaMovel() {
        System.out.println("Arranhando o móvel :>");
    }
}
