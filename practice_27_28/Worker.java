package practice_27_28;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Worker {

    @MyAnnotation(title = "sum")
    public void sum(Data data) {
        int sum = 0;
        ArrayList<Integer> numbers = data.getNumbers();
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    @MyAnnotation(title = "print")
    public void print(Data data) {
        ArrayList<String> words = data.getWords();
        for (int i = 0; i < words.size()-1; i++) {
            System.out.print(words.get(i) + data.getDelimeter());
        }
        System.out.println(words.get(words.size()-1));
    }

    public static String getReflectionTasks() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks"))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
