package services;

import com.google.gson.Gson;
import model.Moeda;
import util.EnvReader;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMoeda {

    public void converterMoeda(Scanner scanner, String moedaOrigem, String moedaDestino) {
        try {
            String apiKey = EnvReader.get("API_KEY");
            System.out.println(apiKey);
            URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaOrigem + "/" + moedaDestino);
            System.out.println(endereco);
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new Gson();
            Moeda conversao = gson.fromJson(json, Moeda.class);
            double taxa = conversao.conversion_rate();
            System.out.println("Taxa: " + taxa);

            System.out.println("Digite o valor que deseja converter:");
            double valor = scanner.nextDouble();

            double resultado = valor * taxa;

            System.out.println(String.format("Valor %.2f [%s] corresponde ao valor de -> %.2f [%s]", valor, moedaOrigem, resultado, moedaDestino));


        } catch (Exception e) {
            System.out.println("Ocorreu um erro na conversão: " + e.getMessage());
        }
    }
}
