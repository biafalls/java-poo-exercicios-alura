package desafio;

public class Usuario {
    private String nome;
    private String email;
    private String plano;

    public void ouvir(Audio audio) {
        audio.reproduzir();
    }

    public void curtir(Audio audio) {
        audio.curtir();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}
