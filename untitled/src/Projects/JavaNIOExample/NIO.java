package Projects.JavaNIOExample;

import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NIO{
    public static void main(String[] args) {

        try {

            // 1. Create a directory
            Path dir = Paths.get("DemoFolder");
            if (!Files.exists(dir)) {
                Files.createDirectory(dir);
                System.out.println("Directory created.");
            }

            // 2. Create a file
            Path file = Paths.get("DemoFolder/sample.txt");
            if (!Files.exists(file)) {
                Files.createFile(file);
                System.out.println("File created.");
            }

            // 3. Check whether a file exists
            if (Files.exists(file)) {
                System.out.println("File exists.");
            } else {
                System.out.println("File does not exist.");
            }

            // 4. Write a list of strings into a file
            List<String> lines = Arrays.asList(
                    "Welcome to Java NIO",
                    "This is line 2",
                    "This is line 3"
            );
            Files.write(file, lines);
            System.out.println("Data written to file.");

            // 5. Read all lines from text file
            System.out.println("\nReading Lines:");
            List<String> data = Files.readAllLines(file);
            for (String s : data) {
                System.out.println(s);
            }

            // 6. Read all bytes from file
            byte[] bytes = Files.readAllBytes(file);
            System.out.println("\nTotal Bytes = " + bytes.length);

            // 7. Copy one file to another
            Path copyFile = Paths.get("DemoFolder/copy.txt");
            Files.copy(file, copyFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied.");

            // 8. Rename a file
            Path renamed = Paths.get("DemoFolder/renamed.txt");
            Files.move(copyFile, renamed, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File renamed.");

            // 9. Move a file to another directory
            Path newDir = Paths.get("NewFolder");
            if (!Files.exists(newDir)) {
                Files.createDirectory(newDir);
            }

            Path movedFile = Paths.get("NewFolder/renamed.txt");
            Files.move(renamed, movedFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved.");

            // 10. Delete a file
            Files.delete(movedFile);
            System.out.println("File deleted.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
