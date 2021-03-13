import java.util.Scanner;

public class ArrayN_10 {
    public static void main(String[] args) {
        int secondArraySize = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше 3: ");
        int n = scanner.nextInt();
        while (n <= 3) {
            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
            n = scanner.nextInt();
        }
        int[] firstArray = new int[n];
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
            for (int i = 0, j = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 == 0) {
                    secondArray[j] = firstArray[i];
                    System.out.print(secondArray[j] + " ");
                }
            }
        }
    }
}

