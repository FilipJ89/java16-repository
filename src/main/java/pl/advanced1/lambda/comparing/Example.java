package pl.advanced1.lambda.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Person person1 = new Person(34, "Ana", "Jackson");
        Person person2 = new Person(12, "Michaela", "Robertson");
        Person person3 = new Person(67, "Joseph", "Marks");

        List<Person> persons = Arrays.asList(person1, person2, person3);

        persons.sort(Comparator.naturalOrder());
        System.out.println(persons);

        Collections.sort(persons, (o1, o2) -> {
            return o1.getName().substring(0,1).compareTo(o2.getName().substring(0,1));
        });
        System.out.println(persons);

        Collections.sort(persons, Comparator.comparing(o -> o.getName().substring(1, 2)));
        System.out.println(persons);
    }
}
