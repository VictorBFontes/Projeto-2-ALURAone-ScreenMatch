package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epsPorTemporada;
    private int minsPorEp;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public int getMinsPorEp() {
        return minsPorEp;
    }

    public void setMinsPorEp(int minsPorEp) {
        this.minsPorEp = minsPorEp;
    }

    @Override //Sobrescrita de códigos, isso é uma anotação do Java e, neste caso é opcional
    public int getDuracaoMin() {
        return (temporadas * epsPorTemporada * minsPorEp);
    }
}
