import java.io.IOException;
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



        List<String> blackList = null;
        try {
            blackList = Files.readAllLines(Paths.get("blackList.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }



        List<String> blackLines = new ArrayList<>();

        for (String line : text.split("\\.")) {
            if (checkLinesIsBlack(line, blackList))
                blackLines.add(line);
        }


        if (blackLines.isEmpty()) {
            System.out.println("Текст прошел цензуру");
            return;
        }

        System.out.println("В тексте есть " + blackLines.size() + " предложений с нецензурной лексикой");
        System.out.println("вот эти строчки:");
        for (String line : blackLines)
            System.out.println(line);

    }

    private static boolean checkLinesIsBlack(String line, List<String> blackList) {
        for (String word : line.split(" ")){
            word = word.trim();
            if (blackList.contains(word))
                return true;
        }
        return false;
    }
}
