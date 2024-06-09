package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacao; //modificador de acesso (private)
    private int totalAvaliacao;
    private int duracaoMin;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMin);
        System.out.println("Incluído no plano: " + incluidoPlano);

    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public double pegaMedia() {
        return somaAvaliacao / totalAvaliacao;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }
    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }
    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }


    public int getTotalAvaliacao() { //método acessor (get)
        return totalAvaliacao;
    }
}
