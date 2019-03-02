package pl.advanced1.lambda.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order(Arrays.asList(
                new Item("czekolada", BigDecimal.valueOf(4.23), Arrays.asList("kakao", "mleko")),
                new Item("Pierogi", BigDecimal.valueOf(8.50), Arrays.asList("mieso", "maka", "sol")),
                new Item("barszcz", BigDecimal.valueOf(2.13), Arrays.asList("buraki", "sol", "regulatorKwasowosci"))));

        Order order2 = new Order(Arrays.asList(
                new Item("zupkaChinska", BigDecimal.valueOf(1.00), Arrays.asList("syf", "strasznySyf")),
                new Item("energol", BigDecimal.valueOf(2.50), Arrays.asList("tauryna", "kofeina", "substancjeNiszczaceMozg"))));

        List<Order> orderList = Arrays.asList(order1,order2);
        System.out.println(getIngredientsNamesLambda(orderList));
        System.out.println(getIngredientsPrice(orderList));

    }

    public static List<String> getIngredientsNamesLambda(List<Order> orders) {
        return orders.stream()
                .map(order -> order.getMyItems())
                .flatMap(itemList -> itemList.stream())
                .map(item -> item.getIngredientList())
                .flatMap(ingredientStream -> ingredientStream.stream())
                .distinct() // wyrzuca duplikaty
                .collect(Collectors.toList());
    }

    public static List<String> getIngredientsNamesReference(List<Order> orders) {
        return orders.stream()
                .map(Order::getMyItems)
                .flatMap(Collection::stream)
                .map(Item::getIngredientList)
                .flatMap(Collection::stream)
                .distinct() // wyrzuca duplikaty
                .collect(Collectors.toList());
    }

    public static BigDecimal getIngredientsPrice(List<Order> orders) {
        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .map(item -> item.getPrice())
                .reduce(BigDecimal.ZERO, (price1, price2) -> price1.add(price2));
    }
}
