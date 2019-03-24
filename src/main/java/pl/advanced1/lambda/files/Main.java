package pl.advanced1.lambda.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Alcohol> alcoholList = Arrays.asList(
                new Alcohol("Bear", "Tatra", 5,2.00,false),
                new Alcohol("Bear", "Harnas", 8,2.30,false),
                new Alcohol("Vodka", "Wyborowa", 30, 23.50,true),
                new Alcohol("Whiskey", "JackDaniels", 28, 30.80,true),
                new Alcohol("Vodka", "Parkowa", 30, 14.50,false)
        );

        // File.separator dodaje odpowiedni znak w zaleznosci od systemu: "/" dla Lin, IOS i "\" dla Windows
        String path = "F:" + File.separator + "code.txt";

        try {
            final AlcoholSerializer serializer = new AlcoholSerializer(path);
            serializer.serializeAlcohols(alcoholList);
            serializer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            AlcoholDeserializer deserializer = new AlcoholDeserializer(path);
            deserializer.readList(deserializer.readAlcohols());
            deserializer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
