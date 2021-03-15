import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int arraysSize = scanner.nextInt();
        while (arraysSize <= 0) {
            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
            arraysSize = scanner.nextInt();
        }
        int[][] matrix = new int[arraysSize][arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            for (int j = 0; j < arraysSize; j++) {
                matrix[i][j] = (int) (Math.random() * 51);
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
        int sumEvenElementsMajorDiagonal = 0;
        for (int i = 0, j = 0; i < arraysSize; i++, j++) {
                if (i == j && matrix[i][j] % 2 == 0) {
                    sumEvenElementsMajorDiagonal += matrix[i][j];
            }
        }
        System.out.println("Сумма чётных элементов главной диагонали: " + sumEvenElementsMajorDiagonal + "\n");
        System.out.print("Нечётные элементы, находящиеся в главной диагонали и под ней: ");
        for (int i = 0; i < arraysSize; i++) {
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
        int productElementsMajorDiagonal = 1;
        int productElementsSecondaryDiagonal = 1;
        for (int i = 0; i < arraysSize; i++) {
            for (int j = 0; j < arraysSize; j++) {
                if (i == j) {
                    productElementsMajorDiagonal *= matrix[i][j];
                } else if (i + j + 1 == arraysSize) {
                    productElementsSecondaryDiagonal *= matrix[i][j];
                }
            }
        }
        if (productElementsMajorDiagonal > productElementsSecondaryDiagonal) {
            System.out.println("Произведение элементов главной диагонали больше," +
                    " чем произведение элементов побочной" + "\n");
        } else if (productElementsMajorDiagonal < productElementsSecondaryDiagonal) {
            System.out.println("Произведение элементов побочной диагонали больше," +
                    " чем произведение элементов главной" + "\n");
        } else  {
            System.out.println("Произведения диагоналей равны" + "\n");
        }
        int sumEvenElementsAboveMajorDiagonal = 0;
        for (int i = 0; i < arraysSize; i++) {
            for (int j = 1; j > i && j < arraysSize; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sumEvenElementsAboveMajorDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("Сумма чётных элементов, стоящих над главной диагональю равна: "
                + sumEvenElementsAboveMajorDiagonal + "\n");
        System.out.println("Транспонированная матрица: ");
        int[][] newMatrix = new int[arraysSize][arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            for (int j = 0; j < arraysSize; j++) {
                newMatrix[i][j] = matrix[j][i];
                System.out.print(newMatrix[i][j] + " \t\t");
            }
            System.out.println('\n');
        }
    }
}
//    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
//        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
//        матрицы).
//        1) Почитать сумму четных элементов стоящих на главной диагонали.
//        2)Вывести нечетные элементы находящиеся под главной
//        диагональю(включительно).
//        3)Проверить произведение элементов какой диагонали больше.
//        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
//        включительно)
//        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//строкой и т. д.)