public class Movie {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    private double somaAvaliacao; //modificador de acesso (private)
    private int totalAvaliacao;
    int duracaoMin;

    int getTotalAvaliacao() { //método acessor (get)
        return totalAvaliacao;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMin);
        System.out.println("Incluído no plano: " + incluidoPlano);

    }

    void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    double pegaMedia() {
       return somaAvaliacao / totalAvaliacao;
    }
}
