package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


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
    System.out.println("print"
            +"game");
    List<FilmeDto> a = new ArrayList<>();
    a.add(new FilmeDto());
    InputStream inputStream = new FileInputStream(new File("Aquecimento", "saida"));
  }
}
