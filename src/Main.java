import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String string = "abABCaBCAcaa";

        System.out.println(Cutting.cut(string));
        System.out.println(Replacement.replace(string));
        System.out.println(Words.getPalindroms(Words.getWordsList()));
        Words.writePalindromList(Words.getPalindroms(Words.getWordsList()));

        List<String> text = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/text"))) {
            String line = reader.readLine();
            while (line != null) {
                text.add(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] sentences;
        String[] tеxtArray = text.toArray(new String[text.size()]);
        for (String s : tеxtArray) {
            sentences = s.split("[.!?]");
            for (int j = 0; j < sentences.length; j++) {
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/new text"))) {
                for (String element : sentences) {
                    if (TextFormatter.getAmountOfWordsInLine(element) >= 3 && TextFormatter.getAmountOfWordsInLine(element)
                            <= 5 || TextFormatter.containsPalindrom(element)) {
                        writer.write(element + ".\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
