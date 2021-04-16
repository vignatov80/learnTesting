package config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static Properties properties;
    private static final String propertyFilePath = "config.properties";
    //Configure reader to get data from config.properties
    public static void configFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader((new FileReader(propertyFilePath)));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("Config.properties not found at " + propertyFilePath);
        }
    }
}
