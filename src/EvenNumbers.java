public class EvenNumbers {
    public static void main(String[] args) {
        int arraySize = 0;
        for (int i = 2; i < 21; i += 2) {
            arraySize++;
        }
        int[] arrayOfEvenNumbers = new int[arraySize];
        for (int i = 0, j = 2; i < arrayOfEvenNumbers.length; i++, j += 2) {
            arrayOfEvenNumbers[i] = j;
            System.out.print(arrayOfEvenNumbers[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
            System.out.println(arrayOfEvenNumbers[i]);
        }
    }
}
//)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.


