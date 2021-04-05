public class Cutting {

    public static String cut(String string) {

        String cutOut = string.substring(string.indexOf('A'), string.lastIndexOf('B') + 1);
        return string.replace(cutOut, "");
    }
}
//) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//        последнего вхождения сивола(B).