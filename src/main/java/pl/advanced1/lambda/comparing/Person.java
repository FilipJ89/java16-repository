package pl.advanced1.lambda.comparing;

public class Person implements Comparable<Person> {
    private int age;
    private String name;
    private String surename;

    public Person(int age, String name, String surename) {
        this.age = age;
        this.name = name;
        this.surename = surename;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}
