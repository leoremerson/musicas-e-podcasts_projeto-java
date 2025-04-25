package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public Podcast(String titulo, int duracao, String apresentador, String descricao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public void exibirFicha() {
        System.out.println("\n🎙️ Ficha do Podcast:");
        System.out.println("Nome: " + getTitulo());
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração: " + getDuracao() + " min");
    }

    @Override
    public void marcarComoFavorito() {
        super.marcarComoFavorito();
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }
}

