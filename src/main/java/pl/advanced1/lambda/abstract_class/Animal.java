package pl.advanced1.lambda.abstract_class;

import java.util.Objects;

public abstract class Animal {

    private static final int NAME_MIN_LENGTH = 1;
    private String name;

    public Animal(String name) {
        this.name = Objects.requireNonNull(name, "[name] cannot be null!");
        if (name.length() <= NAME_MIN_LENGTH) {
            throw new IllegalArgumentException("[name] should be longer than 1 character");
        }
    }

    public abstract void eat();

    public abstract void play();
}
