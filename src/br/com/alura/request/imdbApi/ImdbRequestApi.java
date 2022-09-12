package br.com.alura.request.imdbApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;

public class ImdbRequestApi {
	public static void main(String[] args) throws IOException, InterruptedException {
		String API_Key = new API_Key().API_Key();
		HttpRequest req = HttpRequest.newBuilder().GET()
				.uri(URI.create("https://imdb-api.com/en/API/Top250Movies/" + API_Key)).build();

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpResponse<String> res = httpClient.send(req, BodyHandlers.ofString());

		System.out.println(res.body());
	}
}
