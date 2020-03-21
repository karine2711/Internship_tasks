package spring.beans.ecourse.Lessons123;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("client")
@Scope("prototype")
@PropertySource("classpath:ecourse/client.properties")
public class Client {
    static int staticId = 0;
    private final int id;
    private String fullName;
    String greeting;

    public Client(String fullName) {
        this.id = staticId;
        this.fullName = fullName;
        staticId++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Value("${greeting}")
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }

}
