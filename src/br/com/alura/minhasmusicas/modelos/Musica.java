package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, String artista, String album, String genero) {
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public void exibirFicha() {
        System.out.println("\n🎵 Ficha da Música:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + getDuracao() + " min");
    }

    @Override
    public void marcarComoFavorito() {
        super.marcarComoFavorito();
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }
}

