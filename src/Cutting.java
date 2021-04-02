public class Cutting {

    public static String cut(String string) {
        int from = string.indexOf('A');
        int to = string.lastIndexOf('B');
        String cutOut = string.substring(from, to + 1);
        String replacement = "";
        return string.replace(cutOut, replacement);
    }
}
//) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//        последнего вхождения сивола(B).