package com.miproyecto;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyApi {

    private static final String API_KEY = "473912c8380926be959f5f59"; // Usa tu clave real de API
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair";

    public static Map<String, Double> getExchangeRates(String from, String[] targets) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Map<String, Double> rates = new HashMap<>();
        for (String to : targets) {
            String url = String.format("%s/%s/%s", BASE_URL, from, to);
            HttpRequest request;
            try {
                request = HttpRequest.newBuilder()
                        .uri(new URI(url))
                        .GET()
                        .build();
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException("Error en la sintaxis de la URL: " + url, e);
            }

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
                if (jsonResponse.has("conversion_rate")) {
                    rates.put(to, jsonResponse.get("conversion_rate").getAsDouble());
                } else {
                    System.out.println("La moneda de destino " + to + " no está disponible en la respuesta de la API.");
                }
            } else {
                System.out.println("Respuesta no exitosa de la API para la moneda " + to + ": " + response.statusCode());
            }
        }
        return rates;
    }
}
