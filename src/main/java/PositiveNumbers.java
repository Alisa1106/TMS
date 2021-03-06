public class PositiveNumbers {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 0;
        int thirdNumber = -3;
        int positiveNumbers = 0;
        if (firstNumber > 0) {
            positiveNumbers++;
        }
        if (secondNumber > 0) {
            positiveNumbers++;
        }
        if (thirdNumber > 0) {
            positiveNumbers++;
        }
        System.out.println("Количество положительных чисел: " + positiveNumbers);
    }
}
