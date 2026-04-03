import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Filme> colecaoFilmes = new ArrayList<>();
        
        Diretor cadDiretor1 = new Diretor("Ryan Coogler", "EUA");
        FilmeCinema cadCinema1 = new FilmeCinema("Pantera Negra", 2018, cadDiretor1, 135);
        colecaoFilmes.add(cadCinema1);

        Diretor cadDiretor2 = new Diretor("Chad Stahelski", "EUA");
        FilmeCinema cadCinema2 = new FilmeCinema("John Wick 3: Parabellum", 2019, cadDiretor2, 131);
        colecaoFilmes.add(cadCinema2);

        Diretor cadDiretor3 = new Diretor("Larry Charles", "EUA");
        FilmeStreaming cadStreaming1 = new FilmeStreaming("Borat", 2006, cadDiretor3, "Disney+");
        colecaoFilmes.add(cadStreaming1);

        Diretor cadDiretor4 = new Diretor("Mel Gibson", "EUA e Austrália");
        FilmeStreaming cadStreaming2 = new FilmeStreaming("Até o Último Homem",  2016, cadDiretor4, "Amazon");
        colecaoFilmes.add(cadStreaming2);

        for(Filme exibe : colecaoFilmes){
            exibe.exibirDetalhes();
            System.out.println();
        }
    }
}