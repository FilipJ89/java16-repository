package pl.advanced1.lambda.abstract_class;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("Lion") {
            @Override
            public void eat() {
                System.out.println("Lion eats meat");
            }

            @Override
            public void play() {
                System.out.println("Wrraaauuu Grrraaauuu, Lion ate your face off");
            }
        };

        Animal panda = new Animal("Panda") {
            @Override
            public void eat() {
                System.out.println("Pande eats bamboo");
            }

            @Override
            public void play() {
                System.out.println("Cuddle cuddle panda");
            }
        };

        Zoo zoo = new Zoo();
        zoo.handleAnimal(lion);
        zoo.handleAnimal(panda);
        zoo.handleAnimal(new Dinosaur("Rex"));

    }

    Animal maybeCat = new Animal("cat") {
        @Override
        public void eat() {

        }

        @Override
        public void play() {

        }

        public void miauuu(){

        }
    };
}
