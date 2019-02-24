package pl.advanced1.lambda.null_handling;

public class Computer {

    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
}
