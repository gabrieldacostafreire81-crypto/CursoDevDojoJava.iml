package academy.devdojo.maratonajava.javacore.CsobregargaMetodos.Dominio;

public class Anime {
    private String nome;
    private String tipoAnime;
    private int episodios;
    private String genero;

    public void init (String nome, String tipoAnime, int episodios) {
        this.nome = nome;
        this.tipoAnime = tipoAnime;
        this.episodios = episodios;

    }
    public void init (String nome, String tipoAnime, int episodios, String genero) {
       this.init (nome, tipoAnime, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Nome do anime: " + this.nome);
        System.out.println("Tipo Anime: "+this.tipoAnime);
        System.out.println("Episodios: "+this.episodios);
        System.out.println("Genero: "+this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoAnime(String tipoAnime) {
        this.tipoAnime = tipoAnime;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoAnime() {
        return this.tipoAnime;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

}
  // Sobrecarga de metodos assinaturas iguais porem quantidades diferentes...