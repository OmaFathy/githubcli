package org.example.service;

import org.example.api.GitHubApiClient;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActivityService {

    public void fetchAndDisplayUserActivity(String username) throws Exception {
        GitHubApiClient apiClient = new GitHubApiClient();
        String activityJson = apiClient.getUserActions(username);

        // Parse the JSON response
        JSONArray events = new JSONArray(activityJson);

        if (events.length() == 0) {
            System.out.println("No recent activity found for the user.");
        } else {
            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                String type = event.getString("type");
                String repoName = event.getJSONObject("repo").getString("name");
                System.out.println(type + " on " + repoName);
            }
        }
    }
}
