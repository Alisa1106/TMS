public class OddIndexes {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        double sumOfElementsOddIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (i % 2 != 0) {
                sumOfElementsOddIndex += intArray[i];
            }
        }
        System.out.println("\n");
        System.out.println("Среднее арифметическое элементов с нечётным индексом: "
                + sumOfElementsOddIndex / intArray.length + "\n");
    }
}
//2) Найти среднее арифметическое элементов с нечетными номерами.