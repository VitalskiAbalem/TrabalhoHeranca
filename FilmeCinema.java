public final class FilmeCinema extends Filme {
    private int duracaoMinutos;

    public FilmeCinema(String titulo, int anoLancamento, Diretor diretor, int duracaoMinutos) {
        super(titulo, anoLancamento, diretor);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    
}
