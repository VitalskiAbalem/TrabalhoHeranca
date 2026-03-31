public final class FilmeStreaming extends Filme {
    private String plataforma;

    public FilmeStreaming(String titulo, int anoLancamento, Diretor diretor, String plataforma) {
        super(titulo, anoLancamento, diretor);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    
}
