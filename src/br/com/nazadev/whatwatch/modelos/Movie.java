package br.com.nazadev.whatwatch.modelos;

public class Movie {
    private String name;
    private String genre;
    private String description;
    private int releaseYear;
    private boolean included;
    private double allRating;
    private int totalRatings;

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public double getAllRating() {
        return allRating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public void showDetails() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Genêro: " + genre);
        System.out.println("Descrição: " + description);
        System.out.println("Lançado em: " + releaseYear);
    }

    public void setAllRating(double rate){
        allRating += rate;
        totalRatings++;
    }

    public double averageRating() {
        return allRating /= totalRatings;
    }
};
