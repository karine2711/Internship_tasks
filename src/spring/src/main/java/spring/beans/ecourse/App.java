package spring.beans.ecourse;

public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client(1,"John Smith");
        app.eventLogger=new ConsoleEventLogger();
        app.logEvent("Some event for user1");
    }

    private void logEvent(String msg){
        String message=msg.replaceAll(Integer.toString(client.getId()), client.getFullName());
        eventLogger.logEvent(message);
    }
}
