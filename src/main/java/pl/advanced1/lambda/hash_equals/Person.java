package pl.advanced1.lambda.hash_equals;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surename;

    public Person(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surename, person.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename);
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }
}
