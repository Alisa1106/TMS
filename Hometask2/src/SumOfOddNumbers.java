public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sumOfOddNumbers = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sumOfOddNumbers += i;
            }
        }
        System.out.println("Сумма всех нечётных чисел от 1 до 99 равна " + sumOfOddNumbers);
    }
}
