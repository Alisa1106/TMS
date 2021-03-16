public class ReplacementElements {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int maxElement = -1;
        int maxElementIndex = 0;
        int firstElement = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] >= maxElement) {
                maxElement = intArray[i];
                maxElementIndex = i;
                firstElement = intArray[0];
            }
        }
        System.out.println("\n");
        for (int i = 0; i < intArray.length; i++) {
            intArray[0] = maxElement;
            intArray[maxElementIndex] = firstElement;
            System.out.print(intArray[i] + "\t");
        }
    }
}
//        10) Найти максимальный элемент в массиве и поменять его местами с нулевым
//        элементом