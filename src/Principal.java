import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();

        System.out.println("Teste123");
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMin(180);
        meuFilme.setIncluidoPlano(true);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Star Trek");
        serie.setAnoLancamento(1985);
        serie.setIncluidoPlano(true);
        serie.setTemporadas(9);
        serie.setEpsPorTemporada(20);
        serie.setMinsPorEp(27);
        serie.exibeFichaTecnica();
        System.out.println("Duração para maratonar " + serie.getNome() + ": " + serie.getDuracaoMin() + " minutos");

        Movie outroFilme = new Movie();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMin(200);
        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());
    }
}