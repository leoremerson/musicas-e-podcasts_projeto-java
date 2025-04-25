package br.com.alura.minhasmusicas.modelos;

public class Classificacao {

    public void classificarPorCurtidas(Audio audio) {
        if (audio.getCurtidas() >= 500) {
            audio.setClassificacao(5);  // Excelente
        } else if (audio.getCurtidas() >= 300) {
            audio.setClassificacao(4);  // Bom
        } else if (audio.getCurtidas() >= 100) {
            audio.setClassificacao(3);  // Médio
        } else {
            audio.setClassificacao(2);  // Ruim
        }
    }

    public void classificarPorReproducoes(Audio audio) {
        if (audio.getTotalReproducoes() >= 2000) {
            audio.setClassificacao(5);  // Excelente
        } else if (audio.getTotalReproducoes() >= 1000) {
            audio.setClassificacao(4);  // Bom
        } else if (audio.getTotalReproducoes() >= 500) {
            audio.setClassificacao(3);  // Médio
        } else {
            audio.setClassificacao(2);  // Ruim
        }
    }
}

