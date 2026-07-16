package exercicios.aula2modificadoresdeacesso;

public class Produto {
    /*3.Desenvolva uma classe Produto com os atributos privados nome e preco.
    Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/
    private String nome;
    private double preco;

    public void aplicaDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -=desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
