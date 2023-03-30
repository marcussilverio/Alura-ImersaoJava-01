package com.github.marcussilverio;

import java.util.List;

public class PrintMovies {
  public static void printMovies (List<FilmeDto> movies) {
    movies
        .forEach(movie -> {
      System.out.println("----------------------------------------------------------------");
      System.out.println("Titulo: " + movie.getTitle());
      System.out.println("Ranking: " + movie.getRank());
      System.out.println("Ano: " + movie.getYear());
      System.out.println("⭐".repeat((int) Double.parseDouble(movie.getImDbRating())));
    });
  }
}
