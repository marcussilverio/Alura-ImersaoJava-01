package com.github.marcussilverio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmeDto {
  private String id;
  private String rank;
  private String title;
  private String fullTitle;
  private String year;
  private String image;
  private String crew;
  private String imDbRating;
  private String imDbRatingCount;


}
