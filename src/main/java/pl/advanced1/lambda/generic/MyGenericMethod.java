package pl.advanced1.lambda.generic;

import java.math.BigDecimal;

public class MyGenericMethod {

    private String maybeName;
    private double maybeIncome;
    private BigDecimal hugeNumber;

    public MyGenericMethod(String maybeName, double maybeIncome, BigDecimal hugeNumber) {

        this.maybeName = validateData(maybeName);
        this.maybeIncome = validateData(maybeIncome);
        this.hugeNumber = validateData(hugeNumber);
    }

    public <T> T validateData(T data) {
        if (data == null) {
            throw new IllegalArgumentException("null not allowed");
        } else {
            return data;
        }
    }
}
