package org.example;

import org.example.api.GitHubApiClient;
import org.example.cli.CLIHandler;
import org.example.model.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Hardcoded username for now; you can accept it via args as well
        String username = "OmaFathy";

        CLIHandler cliHandler = new CLIHandler();
        cliHandler.handleUserInput(username);


        }
}