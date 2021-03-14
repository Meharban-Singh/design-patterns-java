package adapter;

public class Slack {
    // do things

    public void sendMessageToService(Service service, String msg) {
        service.receiveMessage(msg);
    }
}
