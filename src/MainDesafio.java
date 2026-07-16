import desafio.MinhasPreferidas;
import desafio.Musica;
import desafio.Podcast;
import desafio.Usuario;

public class MainDesafio {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Cherry");
        musica1.setArtista("Harry Styles");
        musica1.setAlbum("Fine Line");
        musica1.setGenero("Pop");
        musica1.setAnoLancamento(2019);

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Hipsters Ponto Tech");
        podcast1.setApresentador("Paulo Silveira");
        podcast1.setCategoria("Tecnologia e programação");

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Beatriz");
        usuario1.setEmail("bia@email.com");
        usuario1.setPlano("Premium");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Carlos");
        usuario2.setEmail("carlos@email.com");
        usuario2.setPlano("Gratuito");

        for (int i = 0; i < 100; i++) {
            usuario1.ouvir(musica1);
            usuario2.ouvir(musica1);
        }

        usuario1.curtir(musica1);
        usuario1.ouvir(podcast1);

        usuario2.curtir(musica1);
        for (int i = 0; i < 50; i++) {
            usuario2.curtir(podcast1);
        }

        musica1.exibirFichaTecnica();
        System.out.println("Avaliação: " + musica1.getAvaliacao());

        System.out.println();

        podcast1.exibirFichaTecnica();
        System.out.println("Avaliação: " + podcast1.getAvaliacao());

        System.out.println();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);
    }
}
