public class ArrayOfEvenNumbers_1 {
    public static void main(String[] args) {
        int arraySize = 0;
        for (int i = 2; i < 21; i += 2) {
            arraySize++;
        }
        int[] arrayOfEvenNumbers = new int[arraySize];
        for (int i = 0, j = 2; i < arrayOfEvenNumbers.length; i++, j += 2) {
            arrayOfEvenNumbers[i] = j;
            System.out.print(arrayOfEvenNumbers[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
            System.out.println(arrayOfEvenNumbers[i]);
        }
    }
}

