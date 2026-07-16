package exercicios.aula1conceitosfundamentais;

public class MainAula1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOlaMundo();

        Calculadora calculadora = new Calculadora();
        calculadora.retornaDobro(12);

        Musica musica = new Musica();
        musica.titulo = "Ouro Marrom";
        musica.artista = "Jota.pê";
        musica.anoLancamento = 2024;
        musica.exibeFichaTecnica();

        musica.avalia(10);
        musica.avalia(9);
        musica.avalia(8);
        System.out.println("A média das avaliações é " +musica.calculaMediaAvaliacoes() + " \n");

        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.ano = 1978;
        carro.cor = "Azul";
        carro.exibirFichaTecnica();
        System.out.println("Idade do carro: " +carro.calculaIdadeCarro() + " \n");

        Aluno aluno = new Aluno();
        aluno.nome = "Antonia Fernandes";
        aluno.idade = 12;
        aluno.exibirInformacoes();
    }
}
