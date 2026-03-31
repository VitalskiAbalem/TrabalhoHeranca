public class Filme {
    private String titulo;
    private int anoLancamento;
    private Diretor diretor;
    
    public Filme(String titulo, int anoLancamento, Diretor diretor) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    
}
