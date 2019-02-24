package pl.advanced1.lambda.null_handling;

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

    public Chipset getChipset() {
        return chipset;
    }
}
