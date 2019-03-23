package pl.advanced1.lambda.generic;

import pl.advanced1.lambda.abstract_class.Animal;
import pl.advanced1.lambda.abstract_class.Dinosaur;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyStringSecret dream = new MyStringSecret("hahaha");
        BigDecimalSecret income = new BigDecimalSecret(BigDecimal.valueOf(2000));

        MyGenericSecret<Integer> intiger = new MyGenericSecret<>(4);
        MyGenericSecret<String> string = new MyGenericSecret<>("lala");
        MyGenericSecret<BigDecimal> bigdec = new MyGenericSecret<>(BigDecimal.valueOf(1000000));

    }

}
