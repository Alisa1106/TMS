public class MaxElement {
    public static void main(String[] args) {
        int[] intArray = new int[12];
        int maxElement = -1;
        int maxElementIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 16);
            System.out.print(intArray[i] + " ");
            if (intArray[i] >= maxElement) {
                maxElement = intArray[i];
                maxElementIndex = i;
            }
        }
        System.out.println("\n");
        System.out.println("Самый большой элемент массива: " + maxElement + ", его индекс: " + maxElementIndex);
    }
}
//    Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.