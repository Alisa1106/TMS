public class InchesToCentimeters {
    public static void main(String[] args) {
        int inches = 1;
        while (inches <= 20) {
            double centimeters = inches * 2.54;
            System.out.print(inches);
            if (inches % 10 == 1 && inches % 100 != 11) {
                System.out.print(" дюйм");
            } else if (inches % 10 >= 2 && inches % 10 <= 4 && inches % 100 < 10) {
                System.out.print(" дюйма");
            } else {
                System.out.print(" дюймов");
            }
            System.out.println( " - это " + centimeters + " сантиметра");
            inches++;
        }
    }
}
