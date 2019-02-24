package pl.advanced1.lambda.null_handling;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Computer fullOne = new Computer(new GraphicsCard((new Chipset("elko"))));
        Computer noChipsetName = new Computer(new GraphicsCard(new Chipset(null)));
        Computer noChipset = new Computer(new GraphicsCard(null));
        Computer noGraphicsCard = new Computer(null);
        Computer empty = null;

        System.out.println(getVendorNameNoError(fullOne));

        System.out.println(getVendorNameSafeImpl(noChipsetName));
        System.out.println(getVendorNameSafeImpl(noChipset));
        System.out.println(getVendorNameSafeImpl(noGraphicsCard));
        System.out.println(getVendorNameSafeImpl(empty));

        Optional<String> jolo = Optional.ofNullable(null);
        System.out.println(jolo.isPresent() ? jolo.get() : null);
        jolo.ifPresent(System.out::println);

    }

    public static String getVendorNameNoError(Computer computer) {
        return computer.getGraphicsCard().getChipset().getVendorname();
    }

    public static String getVendorNameSafeImpl(Computer computer) {
        if (computer == null
                || computer.getGraphicsCard() == null
                || computer.getGraphicsCard().getChipset() == null
                || computer.getGraphicsCard().getChipset().getVendorname() == null) {
            return null;
        }
        return computer.getGraphicsCard().getChipset().getVendorname();
    }

    public static Optional<String> getVendorNameJava8Way(Computer computer) {
        return Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicsCard())
                .map(graphicsCard -> graphicsCard.getChipset())
                .map(chipset -> chipset.getVendorname());
    }

    public static Optional<String> getVendorNameJava8WayShortWay(Computer computer) {
        return Optional.ofNullable(computer)
                .map(Computer::getGraphicsCard)
                .map(GraphicsCard::getChipset)
                .map(Chipset::getVendorname);
    }

}
