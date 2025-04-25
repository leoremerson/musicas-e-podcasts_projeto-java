package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Audio;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.Favoritos;
import br.com.alura.minhasmusicas.modelos.Classificacao;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica("Pra Sempre Será", 5, "O Terno", "atrás/além", "Indie Rock" );
        musica.exibirFicha();
        Podcast podcast = new Podcast("Vrau Cast", 40, "Mike e Cauê", "Aqui, ninguém pesquisa nada, só recebe pessoas pra ver se elas concordam com o que eles já acreditam.");
        podcast.exibirFicha();

        Classificacao classificacao = new Classificacao();

        for (int i = 0; i < 5000; i++) {
            musica.reproduzir();
            if (i % 5 == 0) {
                musica.curtir();
            }
        }

        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
            if (i % 10 == 0) {
                podcast.curtir();
            }
        }

        classificacao.classificarPorCurtidas(musica);
        classificacao.classificarPorReproducoes(musica);
        System.out.println("\nClassificação da música: " + musica.getClassificacao());

        classificacao.classificarPorCurtidas(podcast);
        classificacao.classificarPorReproducoes(podcast);
        System.out.println("Classificação do podcast: " + podcast.getClassificacao() + "\n");

        Favoritos favoritos = new Favoritos();
        favoritos.adicionar(musica);
        favoritos.adicionar(podcast);

        System.out.println("\nLista de favoritos:");
        favoritos.listarFavoritos();
    }
}
