package spring.beans.classwork.customannotations;

import jdk.jfr.Timestamp;
import org.springframework.stereotype.Component;
import spring.beans.classwork.customannotations.annotations.InitAge;
import spring.beans.classwork.customannotations.annotations.Timer;

@Component
@Timer
public class Dog implements Animal {
    private String name;

    @InitAge(5)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
