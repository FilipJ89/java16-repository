package pl.advanced1.lambda.null_handling_java8;

import java.util.Optional;

public class GraphicsCard {

    private Chipset chipset;

    public GraphicsCard(Chipset chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "chipset=" + chipset +
                '}';
    }

    public Optional<Chipset> getChipset() {
        return Optional.ofNullable(chipset);
    }
}
