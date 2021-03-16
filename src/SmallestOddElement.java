public class SmallestOddElement {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int oddElementsCounter = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] % 2 != 0) {
                oddElementsCounter++;
            }
        }
        System.out.println("\n");
        int oddIntArray [] = new int[oddElementsCounter];
        int oddArrayIndex = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                oddArrayIndex++;
                oddIntArray[oddArrayIndex] = intArray[i];
                }
            }
        int minOddElement = oddIntArray[0];
        for (int i = 0; i < oddIntArray.length; i++) {
            if (oddIntArray[i] < minOddElement) {
                minOddElement = oddIntArray[i];
            }
        }
        System.out.println("Наименьший нечётный элемент массива: " + minOddElement);
    }
}
//        4) Найти наименьший нечетный элемент.

