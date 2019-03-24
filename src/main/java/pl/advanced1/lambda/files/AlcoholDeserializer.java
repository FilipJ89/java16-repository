package pl.advanced1.lambda.files;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class AlcoholDeserializer implements Closeable {

    private String filePath;
    private BufferedReader fileReader;

    public AlcoholDeserializer(String filePath) throws FileNotFoundException {
        this.filePath = Objects.requireNonNull(filePath,"Path cannot be null");

        fileReader = new BufferedReader(new FileReader(filePath));
    }

    public List<Alcohol> readAlcohols() throws IOException {
        return readAlcoholsJAva8();
    }

    private List<Alcohol> readAlcoholsJAva7() throws IOException {
        List<Alcohol> list = new ArrayList<>();
        String line = null;
        while ((line = fileReader.readLine()) != null) {
            Scanner scanner = new Scanner(line);
            String brand = scanner.next();
            String type = scanner.next();
            String voltage = scanner.next();
            double price = scanner.nextDouble();
            boolean isTasty = scanner.nextBoolean();

            int voltageInt = Integer.valueOf(voltage.substring(0, voltage.length()-1));
            list.add(new Alcohol(brand,type,voltageInt,price,isTasty));
        }
        return list;
    }

    private List<Alcohol> readAlcoholsJAva8() throws IOException {

        final int BRAND_INX = 0;
        final int TYPE_INX = 1;
        final int VOLTAGE_INX = 2;
        final int PRICE_INX = 3;
        final int TASY_INX = 4;

        return fileReader.lines()
                .filter(line -> line.length()>0)    // wyrzucamy puste linijki
                .map(s -> s.split(" +"))
                .map(o ->  new Alcohol(
                            o[BRAND_INX],
                            o[TYPE_INX],
                            Integer.parseInt(o[VOLTAGE_INX].substring(0,(o[VOLTAGE_INX].length()-1))),
                            Double.parseDouble(o[PRICE_INX]),
                            Boolean.parseBoolean(o[TASY_INX]))
                )
                .collect(Collectors.toList());
    }


    public void readList(List list) {
        list.forEach(alcohol -> System.out.println(alcohol));
    }


    @Override
    public void close() throws IOException {
        fileReader.close();
    }
}
