package org.example.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GitHubApiClient {

    private static final String githubApiUrl = "https://api.github.com/users/";

    public String getUserActions(String userName) {
        StringBuilder responseContent = new StringBuilder();
        String endPoint = githubApiUrl + userName + "/events";

        try {
            URL url = new URL(endPoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            if (status == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    responseContent.append(inputLine);
                }
                in.close();
            } else {
                System.out.println("Error: Received response code " + status);
            }
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching user activity.";
        }

        return responseContent.toString();
    }
}
