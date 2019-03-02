package pl.advanced1.lambda.comparing2.ref_method;

import pl.advanced1.lambda.comparing2.Car;

public class CompareByBrand {

    public static int orderByBrand(Car first, Car second) {
        return first.getType().compareTo(second.getType());
    }
}
