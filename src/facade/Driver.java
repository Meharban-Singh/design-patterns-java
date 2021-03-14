package facade;

/*
 * Facade Design patter
 * =======================
 *
 * Use when a lot of objects are working together to achieve something. Create a new Facade class
 * which talks to all those objects and perform the task in a single method.
 *
 * Example:
 * Here, The classes Connection, AuthToken, Message, NotificationServer are all working together to
 * send a message to the user. Instead of that, we create a new class NotificationService which has a send
 * method which talks to everything else to send a message.
 */

public class Driver {
    public static void main(String[] args) {
        new NotificationService().send("Hi", "151.125.2.5");
    }
}
