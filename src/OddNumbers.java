public class OddNumbers {
    public static void main(String[] args) {
        int arraySize = 0;
        for (int i = 1; i < 100; i += 2) {
            arraySize++;
        }
        int[] arrayOfOddNumbers = new int[arraySize];
        for (int i = 0, j = 1; i < arrayOfOddNumbers.length; i++, j += 2) {
            arrayOfOddNumbers[i] = j;
            System.out.print(arrayOfOddNumbers[i] + " ");
        }
        System.out.println("\n");
        for (int i = arrayOfOddNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfOddNumbers[i] + " ");
        }
    }
}
//)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 … 7 5 3 1).