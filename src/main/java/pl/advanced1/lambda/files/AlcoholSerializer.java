package pl.advanced1.lambda.files;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

public class AlcoholSerializer implements Closeable {
    private static final String RECORD_FORMAT = "%20s %15s %4d%% %10.2f %b";
    private String filePath;
    private PrintWriter fileWriter;


    public AlcoholSerializer(String filePath) throws FileNotFoundException {
        this.filePath = Objects.requireNonNull(filePath, "Null not accepted as filepath");

        fileWriter = new PrintWriter(filePath);
    }

    public void serializeAlcohols(List<Alcohol> alcohols) {
        alcohols.forEach(alcohol -> fileWriter.format(RECORD_FORMAT,
                alcohol.getType(),
                alcohol.getBrand(),
                alcohol.getVoltage(),
                alcohol.getPrice(),
                alcohol.isTasty())
        .println());
    }

    @Override
    public void close() throws IOException {
        fileWriter.flush();
        fileWriter.close();
    }
}
