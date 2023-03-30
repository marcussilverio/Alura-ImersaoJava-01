package org.example;

import java.util.List;

public class PrintMovies {
  public static void printMovies (List<FilmeDto> movies) {
    movies.stream()
        .filter(filme -> Integer.parseInt(filme.getYear()) >= 2000)
        .filter(filme -> Integer.parseInt(filme.getRank()) < 50)
        .forEach(movie -> {
      System.out.println("----------------------------------------------------------------");
      System.out.println("Titulo: " + movie.getTitle());
      System.out.println("Ranking: " + movie.getRank());
      System.out.println("Ano: " + movie.getYear());
      System.out.println("IMDB - Rating: " + movie.getImDbRating());
    });
  }
}
