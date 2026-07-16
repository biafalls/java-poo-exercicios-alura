package exercicios.aula3heranca.ex2;

public class Cachorro extends Animal {
    @Override
    public void emiteSom() {
        System.out.println("AU AU");
    }

    public void abanaRabo() {
        System.out.println("Abanando o rabo :)");
    }
}
