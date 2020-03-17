package java8.task3;

@FunctionalInterface
public interface HumanBehavior {

    void work();

    default void drink() {
        System.out.println("Drinking water");
    }

    default void eat(String meal) {
        System.out.println("Eating " + meal);
    }
}
