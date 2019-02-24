package pl.advanced1.lambda.abstract_class;

public class Dinosaur extends Animal {

    public Dinosaur(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dinosaur eats");
    }

    @Override
    public void play() {
        System.out.println("Dinosaur jumps. What a fun...");
    }
}
