package spring.beans.ecourse.Lessons123;

public class Client {
    private int id;
    private String fullName;
    String greeting;

    public Client(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
