public class Movie {
    String name;
    String genre;
    String description;
    int releaseYear;
    boolean included;
    double allRating;
    int totalRatings;

    void showDetails() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Genêro: " + genre);
        System.out.println("Descrição: " + description);
        System.out.println("Lançado em: " + releaseYear);
    }

    void setAllRating(double rate){
        allRating += rate;
        totalRatings++;
    }

    double averageRating() {
        return allRating /= totalRatings;
    }
};
