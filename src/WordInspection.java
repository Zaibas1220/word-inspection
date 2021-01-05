import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;

    public WordInspection(File file){
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int count = 0;

        while (reader.hasNextLine()) {
            count++;
            reader.nextLine();
        }

        reader.close();
        return count;
    }

    public List<String> wordsContainigZ() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        List<String> list = new ArrayList<>();
        String word = "";

        while (reader.hasNextLine()){
            word = reader.nextLine();

            if (word.contains("z")){
                list.add(word);
            }
        }

        reader.close();

        return list;
    }

    public List<String> wordEndingInL() throws FileNotFoundException {

        Scanner reader = new Scanner(this.file);
        List<String> list = new ArrayList<>();
        String word = reader.nextLine();
        int character = 0;

        while(reader.hasNextLine()){
            character = word.length() - 1;
            String endingWord = String.valueOf(word.charAt(character));

            if (endingWord.equals("l")){
                list.add(word);
            }

            word = reader.nextLine();
        }

        reader.close();

        return list;
    }

    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        List<String> list = new ArrayList<>();
        String word = "";

        while (reader.hasNextLine()) {
            word = reader.nextLine();
            StringBuilder reverse = new StringBuilder();
            String clean = word.replaceAll("\\s+", "").toLowerCase();
            char[] plain = clean.toCharArray();
            for (int i = plain.length - 1; i >= 0; i--) {
                reverse.append(plain[i]);
            }
            if ((reverse.toString()).equals(clean)) {
                list.add(word);
            }
        }

        reader.close();

        return list;
    }
}
