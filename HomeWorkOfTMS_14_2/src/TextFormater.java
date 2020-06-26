public class TextFormater {

    public static int checkQuantityWords(String line) {
        return line.split(" ").length;
    }

    public static boolean checkExistencePalindromes(String line) {
        for (String word : line.split(" ")){
            if (word.equals(new StringBuffer(word).reverse().toString())){
                return true;
            }
        }
        return false;
    }
}
