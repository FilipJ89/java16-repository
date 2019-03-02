package pl.advanced1.lambda.comparing2;

import pl.advanced1.lambda.comparing2.ref_method.CompareByBrand;
import pl.advanced1.lambda.comparing2.ref_method.CompareCars;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;

import static pl.advanced1.lambda.comparing2.ref_method.CompareByBrand.orderByBrand;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("red", "Lexus", "Dunno", 1.6, Year.of(2012));
        Car car2 = new Car("blue", "Renault", "Laguna", 1.2,Year.of(1999));
        Car car3 = new Car("green", "Toyota", "Avensis", 1.4,Year.of(2003));
        Car car4 = new Car("canary", "BMW", "whatever", 2.0,Year.of(2010));
        Car car5 = new Car("burgundy", "Mazda", "6", 1.6,Year.of(2018));

        List<Car> carList = Arrays.asList(car1,car2,car3,car4,car5);

        // Compare year overriding comparator:
        Comparator<Car> comparator1 = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYearOfProduction().compareTo(o2.getYearOfProduction());
            }
        };

        // Compare brands using reference method:
        Comparator<Car> comparator2 = Comparator.comparing(Car::getBrand);

        // Compare reverse capacity using lambda:
        Comparator<Car> comparator3 = (o1, o2) -> (int) (o2.getCapacity() - o1.getCapacity());


        Collections.sort(carList, comparator1);
        System.out.println(carList);

        Collections.sort(carList,comparator2);
        System.out.println(carList);

        Collections.sort(carList,comparator3.reversed());
        System.out.println(carList);

        // Use advancedSort method in CompareCars for sorting
        carList.sort(CompareCars::advancedSort);
        System.out.println(carList);

        // Sort by one condition and in case 2 objects a are equal, sort by another condition
        Comparator comparator = comparator1.thenComparing(comparator2).thenComparing(comparator3);
        Collections.sort(carList, comparator);
        System.out.println(carList);

    }
}
