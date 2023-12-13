package com.example.task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

public class OpenAiEnricher {
    public static Map<String, String> extract(String domain) throws IOException {
        String API_KEY = "";
        URL url = new URL("https://lnu.edu.ua");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        System.out.println(text);
        // JSONObject jsonObject = new JSONObject(text);
        // System.out.println(jsonObject);
        return Map.of("description", "description", "logo", "logo", "address", "address");
    }
}
