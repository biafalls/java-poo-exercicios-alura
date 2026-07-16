package exercicios.aula1conceitosfundamentais;

public class Musica {
    /*3.Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
    exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        String mensagem = """
                =============== Música ===============
                 Título:             %s
                 Artista:            %s
                 Ano de Lançamento:  %d
                """.formatted(titulo, artista, anoLancamento);
        System.out.println(mensagem);
    }

    void avalia(int nota) {
        if(nota >= 0 && nota <=10){
            avaliacao += nota;
            numAvaliacoes++;
        } else {
            System.out.println("A nota deve estar entre 0 e 10");
        }
    }

    double calculaMediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }
}
