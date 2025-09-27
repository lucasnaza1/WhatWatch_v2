public class Principal {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.name = "Jogos Mortais";
        firstMovie.releaseYear = 2001;
        firstMovie.genre = "Terror";

        System.out.println(firstMovie.name);
    }
}