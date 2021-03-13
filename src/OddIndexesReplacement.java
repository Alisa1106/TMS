public class OddIndexesReplacement {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 21);
            System.out.print(intArray[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
               intArray[i] = 0;
            }
            System.out.print(intArray[i] + "\t");
        }
    }
}
//)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//        массив на экран в строку. Замените каждый элемент с нечётным индексом на
//        ноль. Снова выведете массив на экран на отдельной строке.

