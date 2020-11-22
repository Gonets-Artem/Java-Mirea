package practice_21_22;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class WorkServer implements ItemsStore {
    Gson gson = new Gson();
    String path = "http://localhost:3000/posts";
    HttpClient httpClient = HttpClient.newHttpClient();

    @Override
    public List<Item> getAll() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(), List.class);
    }

    @Override
    public Item get(int id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(path+"/"+id))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(), Item.class);
    }

    @Override
    public Item addItem(Item item) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(item)))
                .uri(URI.create(path))
                .setHeader("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(), Item.class);
    }

    @Override
    public Item editItem(int id, Item item) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(gson.toJson(item)))
                .uri(URI.create(path+"/"+id))
                .setHeader("Content-Type", "application/json")
                .build();
        httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(), Item.class);
    }

    @Override
    public void deleteItem(int id) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create(path+"/"+id))
                .build();
        httpClient.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
