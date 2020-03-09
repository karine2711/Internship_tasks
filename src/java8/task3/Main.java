package java8.task3;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        javaInterfaceImpl();
        myInterfaceImpl();

    }

    static void javaInterfaceImpl() {
        BiFunction<String, String, String> mf = String::concat;
        Supplier<String> supplier = () -> "hi";
        Predicate<Integer> predicate = (a) -> a > 5;
        Consumer<String> consumer = (a) -> {
            a = a.toUpperCase();
            System.out.println(a);
            System.out.println(supplier.get());
            System.out.println(mf.apply("me ", "you"));
            System.out.println(predicate.test(8));
        };
        consumer.accept("hello");
    }

    static void myInterfaceImpl(){
        HumanBehavior programmerBehavior = () -> System.out.println("writing code");
        HumanBehavior cookBehavior = () -> System.out.println("Cooking delicious food");
        HumanBehavior singerBehavior=new HumanBehavior(){
            @Override
            public void work(){
                System.out.println("Singing a song");
            }
        };
        Human Karine=new Human("Karine",19,1234567,programmerBehavior);
        Human Ashot=new Human("Ashot", 40, 65437, cookBehavior);
        Human Alla=new Human("Alla",13, 452796, singerBehavior);
        Karine.work();
        Ashot.work();
        Alla.work();
    }

}

