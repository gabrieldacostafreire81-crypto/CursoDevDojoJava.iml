package academy.devdojo.maratonajava.javacore.CsobregargaMetodos.Teste;

import academy.devdojo.maratonajava.javacore.CsobregargaMetodos.Dominio.Anime;

public class AnimeTesteDrive01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Pokemon", "TV", 20, "Ação");
        anime.imprime();
    }
}
