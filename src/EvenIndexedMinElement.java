public class EvenIndexedMinElement {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
        }
        System.out.println("\n");
        int minElement = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (i % 2 == 0 && intArray[i] < minElement) {
                minElement = intArray[i];
            }
        }
        System.out.println("Минимальный элемент с чётным индексом: " + minElement);
    }
}
//        9) Найти наименьший элемент среди элементов с четными индексами массива
