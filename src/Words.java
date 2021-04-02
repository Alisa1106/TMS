import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Words {

    public static List<String> getWordsList() {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/words"))) {
            wordList = reader.lines().collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordList;
    }

    public static List<String> getPalindroms(List<String> wordList) {
        List<String> palindromList = new ArrayList<>();
        int palindromElement = 0;
        for (String element : wordList) {
            String reverse = new StringBuilder(element).reverse().toString();
            if (element.equals(reverse)) {
                palindromList.add(palindromElement, element);
                palindromElement++;
            }
        }
        return palindromList;
    }

    public static void writePalindromList(List<String> palindromList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/palindroms"))) {
            for (String element : palindromList) {
                writer.write(element + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы
