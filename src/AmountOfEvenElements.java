public class AmountOfEvenElements {
    public static void main(String[] args) {
        int[] intArray = new int[15];
        int evenElementsCounter = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
            System.out.print(intArray[i] + " ");
            if (intArray[i] % 2 == 0) {
                evenElementsCounter++;
            }
        }
        System.out.println("\n");
        System.out.println("Количество чётных элементов в массиве: " + evenElementsCounter);
    }
}
//)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//        это количество на экран на отдельной строке.