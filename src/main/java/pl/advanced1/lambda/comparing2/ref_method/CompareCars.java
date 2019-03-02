package pl.advanced1.lambda.comparing2.ref_method;

import pl.advanced1.lambda.comparing2.Car;

public class CompareCars {

    public static int advancedSort(Car first, Car second) {

        int comparingResult = Double.compare(first.getCapacity(), second.getCapacity());
        if (comparingResult != 0) {
            return comparingResult;
        }

        comparingResult = first.getYearOfProduction().compareTo(second.getYearOfProduction());
        if (comparingResult != 0) {
            return comparingResult;
        }

        return first.getBrand().compareTo(second.getBrand());
    }


}
