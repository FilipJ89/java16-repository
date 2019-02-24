package pl.advanced1.lambda.null_handling_java8;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Computer fullOne = new Computer(new GraphicsCard((new Chipset("bello ello"))));
        Computer noChipsetName = new Computer(new GraphicsCard(new Chipset(null)));
        Computer noChipset = new Computer(new GraphicsCard(null));
        Computer noGraphicsCard = new Computer(null);
        Computer empty = null;

        Optional<String> jolo = Optional.ofNullable(null);
        System.out.println(jolo.isPresent() ? jolo.get() : null);
        jolo.ifPresent(System.out::println);

        System.out.println(getVendorNameJava8WayShort(noGraphicsCard));
        System.out.println(getVendorNameJava8Way(fullOne));

    }

    public static String getVendorNameJava8Way(Computer computer) {
       return Optional.ofNullable(computer)
               .flatMap(computer1 -> computer1.getGraphicsCard())
               .flatMap(graphicsCard -> graphicsCard.getChipset())
               .map(chipset -> chipset.getVendorname())
               .orElseGet(() -> "unknown");
    }

    public static String getVendorNameJava8WayShort(Computer computer) {
        return Optional.ofNullable(computer)
                .flatMap(Computer::getGraphicsCard)
                .flatMap(GraphicsCard::getChipset)
                .map(Chipset::getVendorname)
                .orElseGet(() -> "unknown");
    }

}
