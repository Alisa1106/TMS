import java.util.Scanner;

public class PartsOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите чётное положительное число: ");
        int arraySize = scanner.nextInt();
        while (arraySize <= 0 || arraySize % 2 != 0) {
            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
            arraySize = scanner.nextInt();
        }
        int[] intArray = new int[arraySize];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 16);
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        int sumLeftPart = 0;
        for (int i = 0; i < intArray.length / 2; i++) {
            sumLeftPart += intArray[i];
        }
        System.out.println();
        int sumRightPart = 0;
        for (int i = arraySize - 1; i >= intArray.length / 2; i--) {
            sumRightPart += intArray[i];
        }
        if (sumLeftPart > sumRightPart) {
            System.out.println("Сумма левой половины массива больше, чем сумма правой");
        } else if (sumLeftPart < sumRightPart) {
            System.out.println("Сумма правой половины массива больше, чем сумма левой");
        } else  {
            System.out.println("Сумма левой половины равна сумме правой половины");
        }
    }
}
//    Пользователь должен указать с клавиатуры положительное число, а
//        программа должна создать массив указанного размера из случайных целых
//        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//        определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то выдать соответствующее
//        сообщение