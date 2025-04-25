package br.com.alura.minhasmusicas.modelos;

public class Audio implements Favoritavel {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    private boolean favorito = false;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    @Override
    public void marcarComoFavorito() {
        this.favorito = true;
        System.out.println(titulo + " foi marcado como favorito!");
    }

    public boolean isFavorito() {
        return favorito;
    }

    // Getters e setters como antes...
    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}