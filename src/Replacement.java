public class Replacement {

    public static String replace(String string) {
        char target = string.charAt(3);
        char replacement = string.charAt(0);
        return string.replace(target, replacement);
    }
}
//    Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//позиции 0