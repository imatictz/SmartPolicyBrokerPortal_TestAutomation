package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CountryConfigReader {

    private CountryConfigReader() {
    }

    public static String get(String country, String key) {

        String propertyFilePath =
                "src//test//resources//Parameters//"
                + country
                + ".properties";

        Properties properties = new Properties();

        try (FileInputStream input =
                     new FileInputStream(propertyFilePath)) {

            properties.load(input);

            String value = properties.getProperty(key);

            if (value == null || value.trim().isEmpty()) {

                throw new RuntimeException(
                        key + " not specified in "
                        + propertyFilePath
                );
            }

            return value.trim();

        } catch (IOException e) {

            throw new RuntimeException(
                    "Unable to load property file: "
                    + propertyFilePath,
                    e
            );
        }
    }
}