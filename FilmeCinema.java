public class FilmeCinema extends Filme {
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
    
    public void exibirDetalhes() {
        System.out.println("Filme de Cinema - " + getInfoBasica() + ", Duração: " + duracaoMinutos + " minutos");
        System.out.println(getInfoDiretor());
    }
}
