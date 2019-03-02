package pl.advanced1.lambda.stream;

import java.math.BigDecimal;
import java.util.List;

public class Item {
    private String name;
    private BigDecimal price;
    private List<String> ingredientList;

    public Item(String name, BigDecimal price, List<String> ingredientList) {
        this.name = name;
        this.price = price;
        this.ingredientList = ingredientList;
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
