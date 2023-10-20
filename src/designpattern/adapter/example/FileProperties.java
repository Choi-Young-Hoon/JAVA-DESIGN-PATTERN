package designpattern.adapter.example;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        /*
        FileInputStream fileInputStream = new FileInputStream(fileName);
        properties.load(fileInputStream);
         */
        this.properties.load(new FileReader(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        /*
        String comments = "written by FileProperties";
        FileWriter writer = new FileWriter(fileName);
        this.properties.store(writer, comments);
        */
        this.properties.store(new FileWriter(fileName), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        this.properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return this.properties.getProperty(key);
    }
}
