import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "";
        try {
            for (String line : Files.readAllLines(Paths.get("text.txt")))
                text = text.concat(line);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> lines = new ArrayList<>();
        for (String line : text.split("\\.")) {
            line = line.trim();
            if (TextFormater.checkExistencePalindromes(line) || (TextFormater.checkQuantityWords(line) >= 3
                    && TextFormater.checkQuantityWords(line) <= 5)){
                lines.add(line);
            }
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("SortedText.txt"))) {
            for (String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
