package desafio;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;
    private int anoLancamento;

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();

        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Genero: " + genero);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    @Override
    public int getAvaliacao() {
        if (getTotalReproducoes() >= 200) {
            return 10;
        } else if (getTotalReproducoes() >= 100) {
            return 8;
        }
        return 5;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
