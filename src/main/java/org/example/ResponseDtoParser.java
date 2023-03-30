package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ResponseDtoParser {
  public ResponseDto parse(String jsonString) {
    JSONObject jsonObject = new JSONObject(jsonString);
    JSONArray itemsArray = jsonObject.getJSONArray("items");

    List<FilmeDto> filmeDtoList = new ArrayList<>();

    for (int i = 0; i < itemsArray.length(); i++) {
      JSONObject itemObject = itemsArray.getJSONObject(i);

      FilmeDto filmeDto = new FilmeDto();
      filmeDto.setId(itemObject.getString("id"));
      filmeDto.setRank(itemObject.getString("rank"));
      filmeDto.setTitle(itemObject.getString("title"));
      filmeDto.setFullTitle(itemObject.getString("fullTitle"));
      filmeDto.setYear(itemObject.getString("year"));
      filmeDto.setImage(itemObject.getString("image"));
      filmeDto.setCrew(itemObject.getString("crew"));
      filmeDto.setImDbRating(itemObject.getString("imDbRating"));
      filmeDto.setImDbRatingCount(itemObject.getString("imDbRatingCount"));

      filmeDtoList.add(filmeDto);
    }

    ResponseDto responseDto = new ResponseDto();
    responseDto.setItems(filmeDtoList);

    return responseDto;
  }
}
