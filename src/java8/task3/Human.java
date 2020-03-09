package java8.task3;


import java.util.function.Supplier;

public class Human implements HumanBehavior {
    private String name;
    private int age;
    private long idNumber;
    private HumanBehavior job;


    public Human(String name, int age, long idNumber, HumanBehavior job) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.job=job;
    }

    @Override
    public void work() {
      job.work();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getIdNumber() {
        return idNumber;
    }
}
