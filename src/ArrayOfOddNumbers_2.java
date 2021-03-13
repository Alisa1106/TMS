public class ArrayOfOddNumbers_2 {
    public static void main(String[] args) {
        int arraySize = 0;
        for (int i = 1; i <= 99; i += 2) {
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
