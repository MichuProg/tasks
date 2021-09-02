package cwiczenia.File;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("file.txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path)){
        bufferedWriter.write("~~~~~~_________?...._______E_F\n" +
                "__~~~~~__E_____________....~~_\n" +
                "____~~~~~~~_________..__E~~___\n" +
                "_______~~~~~~~~________~~_____\n" +
                "__________~~~~__E____[[..___..\n" +
                "___________[[[[E__~~~~_____...\n" +
                "____________~~~~~~~~_______?..\n" +
                "_________E____~~~~____E______\n" +
                "_______________~~~____________\n" +
                "H______________~~~~~_________T");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}