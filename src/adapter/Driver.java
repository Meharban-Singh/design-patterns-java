package adapter;

/*
 * Adapter Design patter
 * =======================
 *
 * Used when we need to 'adapt' to an external system without changing our internal system.
 *
 * Example:
 * Consider an internal service of slack and it can send messages to its messaging service and
 * messages to some external services like GitHub.
 *
 * Since GitHub is an external service, we cannot make it implement our 'Service' interface.
 * So we create a class called GitHubAdapter which implements Service and talks to external service.
 */

public class Driver {
    public static void main(String[] args) {
        // INTERNAL SYSTEM - send internal message
        Slack slack = new Slack();
        slack.sendMessageToService(new SlackMessage(), "Hi guys");

        // Send message to github
        slack.sendMessageToService(new GitHubAdapter(), "Hi guys");
    }
}
