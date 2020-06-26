import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter("words.txt")) {
            printWriter.println("доход");
            printWriter.println("налог");
            printWriter.println("стэк");
            printWriter.println("топот");
            printWriter.println("шабаш");
            printWriter.println("море");
        }catch (IOException e){
            e.getStackTrace();
        }

        Palindrome.run("words.txt");
    }
}
