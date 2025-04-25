package br.com.alura.minhasmusicas.modelos;

import java.util.ArrayList;

public class Favoritos {
    private ArrayList<Favoritavel> listaFavoritos = new ArrayList<>();

    public void adicionar(Favoritavel item) {
        item.marcarComoFavorito();
        listaFavoritos.add(item);
    }

    public void listarFavoritos() {
        for (Favoritavel item : listaFavoritos) {
            if (item instanceof Audio) {
                Audio audio = (Audio) item;
                System.out.println("- " + audio.getTitulo());
            }
        }
    }
}
