package br.com.nazadev.whatwatch.modelos;

public class Movie {
     String name;
    String genre;
    String description;
    int releaseYear;
    boolean included;
    private double allRating;
    private int totalRatings;

    public int getTotalRatings() {
        return totalRatings;
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
