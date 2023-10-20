package designpattern.adapter.example;

import java.io.IOException;

public class AdapterExampleTest {
    public static void run() {
        FileIO file = new FileProperties();
        try {
            file.readFromFile("file.txt");
            System.out.println("width = " + file.getValue("width"));

            file.setValue("width", "1024");
            file.setValue("height", "512");
            file.setValue("depth", "32");
            file.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
