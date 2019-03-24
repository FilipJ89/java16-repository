package pl.advanced1.lambda.hash_equals;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Filip", "Jo");
        Person person2 = new Person("Filip", "J");
        Person person3 = new Person("Filip", "J");

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        Set<Person> sortedSet = new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getSurename));
        sortedSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        System.out.println(sortedSet);

    }
}
