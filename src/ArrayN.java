import java.util.Scanner;

public class ArrayN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше 3: ");
        int n = scanner.nextInt();
        while (n <= 3) {
            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
            n = scanner.nextInt();
        }
        int[] firstArray = new int[n];
        int secondArraySize = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int)(Math.random() * n + 1);
            System.out.print(firstArray[i] + " ");
            if (firstArray[i] % 2 == 0) {
                secondArraySize++;
            }
        }
        System.out.println("\n");
        if (secondArraySize > 0); {
            int[] secondArray = new int[secondArraySize];
            int secondArrayIndex = -1;
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 == 0) {
                    secondArrayIndex++;
                    secondArray[secondArrayIndex] = firstArray[i];
                    System.out.print(secondArray[secondArrayIndex] + " ");
                }
            }
        }
    }
}
//    Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//        переменную n. Если пользователь ввёл не подходящее число, то программа
//        должна выдать соответствующее сообщение. Создать массив из n случайных
//        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//        только из чётных элементов первого массива, если они там есть, и вывести его
//        на экран.
