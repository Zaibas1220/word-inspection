import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        WordInspection wordInspection = new WordInspection(new File("src/wordlist.txt"));
        System.out.println(wordInspection.wordCount());
        System.out.println(wordInspection.wordsContainigZ());
        System.out.println(wordInspection.wordEndingInL());
        System.out.println(wordInspection.palindromes());
    }
}
