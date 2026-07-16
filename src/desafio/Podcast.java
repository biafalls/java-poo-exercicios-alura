package desafio;

import java.security.spec.RSAOtherPrimeInfo;

public class Podcast extends Audio {
    private String apresentador;
    private String convidado;
    private String categoria;
    private int episodio;

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();

        System.out.println("Apresentador: " + apresentador);
        System.out.println("Convidado: " + convidado);
        System.out.println("Episódio: " + episodio);
        System.out.println("Categoria: " + categoria);
    }

    @Override
    public int getAvaliacao() {
        if (getCurtidas() >= 100) {
            return 10;
        } else if (getCurtidas() >= 50) {
            return 8;
        }
        return 5;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
}
