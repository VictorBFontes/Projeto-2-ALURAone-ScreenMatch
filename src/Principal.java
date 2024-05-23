import br.com.alura.screenmatch.modelos.Movie;

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
    }

}