public class Integer {
    public static void main(String[] args) {
        int integer = 0;
        if (integer > 0) {
            integer++;
        } else if (integer < 0) {
            integer -= 2;
        } else {
            integer = 10;
        }
        System.out.println(integer);
    }
}
