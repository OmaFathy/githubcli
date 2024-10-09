package org.example.cli;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.example.api.GitHubApiClient;

public class CLIHandler {

    private GitHubApiClient gitHubApiClient = new GitHubApiClient();

    public void handleUserInput(String userName) {
        String jsonResponse = gitHubApiClient.getUserActions(userName);

        // Parse the JSON response using Gson
        JsonArray events = JsonParser.parseString(jsonResponse).getAsJsonArray();

        // Display the user's recent GitHub activity
        System.out.println("Recent activity for GitHub user: " + userName);

        for (JsonElement eventElement : events) {
            String eventType = eventElement.getAsJsonObject().get("type").getAsString();
            String repoName = eventElement.getAsJsonObject().get("repo").getAsJsonObject().get("name").getAsString();
            String createdAt = eventElement.getAsJsonObject().get("created_at").getAsString();

            System.out.println("- " + formatEvent(eventType) + " in " + repoName + " at " + createdAt);
        }
    }

    private String formatEvent(String eventType) {
        switch (eventType) {
            case "PushEvent":
                return "Pushed commits";
            case "IssuesEvent":
                return "Opened an issue";
            case "PullRequestEvent":
                return "Created a pull request";
            case "WatchEvent":
                return "Starred a repository";
            default:
                return "Performed an action";
        }
    }
}

