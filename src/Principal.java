public class Principal {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.name = "Jogos Mortais";
        firstMovie.releaseYear = 2001;
        firstMovie.description  = "Um jogo mortal onde vítimas enfrentam testes cruéis para sobreviver.";
        firstMovie.genre = "Terror";

        firstMovie.showDetails();
        firstMovie.setAllRating(8);
        firstMovie.setAllRating(7);
        firstMovie.setAllRating(9.4);

        System.out.println("Total de avaliações: " + firstMovie.getTotalRatings());
        System.out.println(firstMovie.averageRating());
    }
}