package desafio;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int avaliacao;

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " segundos");
        System.out.println("Reproduções: " + totalReproducoes);
        System.out.println("Curtidas: " + curtidas);
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    public void classificar() {
        totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
}
