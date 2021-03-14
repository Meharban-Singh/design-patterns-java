package adapter;

public class SlackMessage implements Service {
    // do things

    @Override
    public void receiveMessage(String msg) {
        System.out.println("Received Slack message \"" + msg + "\"");
    }

}
