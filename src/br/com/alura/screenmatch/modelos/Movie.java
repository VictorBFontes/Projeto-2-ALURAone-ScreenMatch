package br.com.alura.screenmatch.modelos;

public class Movie extends Titulo { //o termo "extends" é para Herdar tudo que tem nona classe Titulo, a famosa "Herança"
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
