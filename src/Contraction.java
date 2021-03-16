public class Contraction {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
        }
        System.out.println("\n");
        int[] secondIntArray = new int[intArray.length];
        int secondIntArrayIndex = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) {
                secondIntArrayIndex++;
                secondIntArray[secondIntArrayIndex] = intArray[i];
            }
        }
        for (int i = 0; i < secondIntArray.length; i++) {
            if (i > secondIntArray.length / 2) {
                secondIntArray[i] = 0;
            }
            System.out.print(secondIntArray[i] + "\t");
        }
    }
}
//        5) «Сожмите» массив, выбросив из него каждый второй элемент.
//        «Освободившиеся» места массива заполните нулями.
