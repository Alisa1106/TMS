public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 0;
        int thirdNumber = -1;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        if (firstNumber > 0) {
            positiveNumbers++;
        } else if (firstNumber < 0) {
            negativeNumbers++;
        }
        if (secondNumber > 0) {
            positiveNumbers++;
        } else if (secondNumber < 0) {
            negativeNumbers++;
        }
        if (thirdNumber > 0) {
            positiveNumbers++;
        } else if (thirdNumber < 0) {
            negativeNumbers++;
        }
        System.out.println("Количество положительных чисел: " + positiveNumbers + ", отрицательных: "
                + negativeNumbers);
    }
}
