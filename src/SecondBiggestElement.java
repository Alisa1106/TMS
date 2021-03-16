public class SecondBiggestElement {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int biggestElement = -1;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] >= biggestElement) {
                biggestElement = intArray[i];
            }
        }
        System.out.println("\n");
        int secondBiggestElement = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] > secondBiggestElement && intArray[i] < biggestElement) {
                secondBiggestElement = intArray[i];
            }
        }
        System.out.println("Второй по величине элемент массива: " + secondBiggestElement);
    }
}
 // 8) Найти второй по величине (т.е. следующий по величине за максимальным)
//        элемент в массиве.

