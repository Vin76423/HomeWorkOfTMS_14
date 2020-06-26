import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    private static List<String> words = new ArrayList<>();
    private static final String PATH = "palindromes.txt";

    public static void run(String path) {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String word;
            while ( (word = bufferedReader.readLine()) != null )
                checkAndSetWord(word);
        }catch (IOException e){
            e.getStackTrace();
        }



        try (PrintWriter printWriter = new PrintWriter(PATH)) {
            for (String word : words)
                printWriter.println(word);
        }catch (IOException e){
            e.getStackTrace();
        }
    }

    private static void checkAndSetWord(String word) {
        StringBuffer str = new StringBuffer(word);
        if (word.equals(str.reverse().toString()))
            words.add(word);
    }
}
