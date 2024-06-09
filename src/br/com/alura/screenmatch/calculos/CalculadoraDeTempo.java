package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Movie f) {
//        tempoTotal += f.getDuracaoMin();
//    }
//
//    public void inclui(Serie s) { //isso se chama sobrecarga de métodos, onde o Java permite ter dois ou mais métodos
//        tempoTotal += s.getDuracaoMin();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoMin();
    }
}
