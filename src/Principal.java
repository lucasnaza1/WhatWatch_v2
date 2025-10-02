import br.com.nazadev.whatwatch.modelos.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setName("Jogos Mortais");
        firstMovie.setReleaseYear(2001);;
        firstMovie.setDescription("Um jogo mortal onde vítimas enfrentam testes cruéis para sobreviver.");
        firstMovie.setGenre("Terror");

        firstMovie.showDetails();
        firstMovie.setAllRating(8);
        firstMovie.setAllRating(7);
        firstMovie.setAllRating(9.4);

        System.out.println("Total de avaliações: " + firstMovie.getTotalRatings());
        System.out.println(firstMovie.averageRating());
    }
}