package java8.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = initPersons();
        Comparator<Person> comparatorByAge = (person1, person2) -> person1.getAge() - person2.getAge();
        Comparator<Person> comparatorByName = (person1, person2) -> person1.getName().compareTo(person2.getName());
        persons.sort(comparatorByAge.thenComparing(comparatorByName));
        printNames(persons);

    }

    static List<Person> initPersons() {
        Person Karine = new Person("Karine", 19);
        Person Ani = new Person("Ani", 15);
        Person Mukuch = new Person("Mukuch", 21);
        return Arrays.asList(Karine, Ani, Mukuch);
    }

    static void printNames(List<Person> persons) {
        persons.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
