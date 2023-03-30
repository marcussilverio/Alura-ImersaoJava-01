package com.github.marcussilverio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Main {
  public static void main (String[] args) throws Exception {
    final String URL = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";//+ System.getenv("API_KEY");
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder(URI.create(URL))
        .GET()
        .build();
    ResponseDto response =
        new ResponseDtoParser()
        .parse(client
            .send(request,HttpResponse.BodyHandlers.ofString())
            .body());
    PrintMovies.printMovies(response.getItems());
  }
}
