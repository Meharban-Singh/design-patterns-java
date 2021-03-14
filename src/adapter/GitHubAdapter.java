package adapter;

import adapter.externalService.GitHub;

public class GitHubAdapter implements Service{
    private GitHub gh = new GitHub();

    public void receiveMessage(String message) {
        gh.incomingMessage(message);
    }
}