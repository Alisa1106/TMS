public class IncreasingSequence {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
        boolean found = true;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i - 1] >= intArray[i]) {
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Это строго возрастающая последовательность");
        } else {
            System.out.println("Этот массив не является строго возрастающей последовательностью");
        }
    }
}
//    Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.