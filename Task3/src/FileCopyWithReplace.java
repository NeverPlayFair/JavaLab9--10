import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyWithReplace {
    public static void main(String[] args) {
        String inputFilePath = "C:/Users/bborek/IdeaProjects/Tak3Lab10/source.txt"; // change on your project path
        String outputFilePath = "C:/Users/bborek/IdeaProjects/Tak3Lab10/destination.txt"; // change on your project path

        System.out.println("Current working directory: "
                + new File("").getAbsolutePath());

        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            System.err.println("The input file does not exist: " + inputFile.getAbsolutePath());
            System.err.println("Make sure the path is correct.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(" ", "-");
                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("The file was copied with spaces replaced with hyphens.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
