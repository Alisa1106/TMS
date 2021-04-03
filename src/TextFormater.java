public class TextFormater {

    public static int getAmountOfWordsInLine(String element) {
        int count = 0;
        for (int i = 0; i < element.length(); i++) {
            if (element.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrom(String element) {
        boolean result = false;
        String[] words = element.split(" ");
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            if (word.equals(reverse) && word.length() > 1) {
                result = true;
            }
        }
        return result;
    }
}
//)Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        Пишем все в ООП стиле. Создаём класс TextFormater
//        в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//        есть возвращает true, если нет false
//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл