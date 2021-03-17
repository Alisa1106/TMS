public class ReplacementElements {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int maxElement = -1;
        int maxElementIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] >= maxElement) {
                maxElement = intArray[i];
                maxElementIndex = i;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < intArray.length; i++) {  // и здесь не придумала ничего умнее
            intArray[maxElementIndex] = intArray[0];
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[0] = maxElement;
            System.out.print(intArray[i] + "\t");
        }
    }
}
//        10) Найти максимальный элемент в массиве и поменять его местами с нулевым
//        элементом