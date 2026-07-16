package exercicios.aula2modificadoresdeacesso;

public class MainAula2 {
    public static void main(String[] args) {
        //ex1
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(11457);
        conta.setSaldo(1790.99);
        conta.titular = "Amanda Lara";

        System.out.println("\n===== Conta Bancaria ======\n");
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Nome do titular: " + conta.titular);
        System.out.println("Saldo em conta:  " + conta.getSaldo());

        conta.setSaldo(3700);
        System.out.println("Novo saldo: " + conta.getSaldo());

        //ex2
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carlos Antônio");
        pessoa1.setIdade(67);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Kamilly Vitória");
        pessoa2.setIdade(17);

        System.out.println("\n===== Idade Pessoa ======\n");
        System.out.println("Nome: " + pessoa1.getNome() + "; Idade: " + pessoa1.getIdade());
        System.out.println("Nome: " + pessoa2.getNome() + "; Idade: " + pessoa2.getIdade());

        pessoa1.verificaIdade();
        pessoa2.verificaIdade();

        //ex3
        Produto produto = new Produto();
        produto.setNome("Iphone 16");
        produto.setPreco(5678.99);

        System.out.println("\n===== Produto ======\n");
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());

        produto.aplicaDesconto(15);
        System.out.println("Preço com desconto aplicado: " + produto.getPreco());

        //ex4
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Léticia");
        aluno1.setNota1(8);
        aluno1.setNota2(5.5);
        aluno1.setNota3(9);
        aluno1.calculaMedia();

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Amanda");
        aluno2.setNota1(3);
        aluno2.setNota2(5);
        aluno2.setNota3(4);

        System.out.println("==== Médias da Sala ====");
        System.out.println(aluno2.getNome() + " - nota final: " + aluno2.calculaMedia());
        System.out.println(aluno1.getNome() + " - nota final: " + aluno1.calculaMedia());

        //ex5
        Livro livro1 = new Livro();
        livro1.setTitulo("Meu Pé de Laranja Lima");
        livro1.setAutor("José Mauro de Vasconcelos");

        Livro livro2 = new Livro();
        livro2.setTitulo("A Hora da Estrela");
        livro2.setAutor("Clarisse Lispector");

        livro1.exibeDetalhes();
        livro2.exibeDetalhes();
    }
}
