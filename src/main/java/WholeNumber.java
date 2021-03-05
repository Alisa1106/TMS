public class WholeNumber {
    public static void main(String[] args) {
        int wholeNumber = 0;
        if (wholeNumber > 0) {
            wholeNumber += 1;
        } else if (wholeNumber < 0) {
            wholeNumber -= 2;
        } else {
            wholeNumber = 10;
        }
        System.out.println(wholeNumber);
    }
}
