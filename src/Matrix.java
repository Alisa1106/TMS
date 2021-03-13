import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int sumEvenElementsMajorDiagonal = 0;
        int productElementsMajorDiagonal = 1;
        int productElementsSecondaryDiagonal = 1;
        int sumEvenElementsAboveMajorDiagonal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int arraysSize = scanner.nextInt();
        while (arraysSize <= 0) {
            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
            arraysSize = scanner.nextInt();
        }
        int[][] matrix = new int[arraysSize][arraysSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 51);
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j && matrix[i][j] % 2 == 0) {
                    sumEvenElementsMajorDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("Сумма чётных элементов главной диагонали: " + sumEvenElementsMajorDiagonal + "\n");
        System.out.print("Нечётные элементы, находящиеся в главной диагонали и под ней: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i >= j && matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    productElementsMajorDiagonal *= matrix[i][j];
                } else if (i + j + 1 == matrix.length) {
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i < j && matrix[i][j] % 2 == 0) {
                    sumEvenElementsAboveMajorDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("Сумма чётных элементов, стоящих над главной диагональю равна: "
                + sumEvenElementsAboveMajorDiagonal + "\n");
        System.out.println("Транспонированная матрица: ");
        int[][] newMatrix = new int[arraysSize][arraysSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = matrix[j][i];
                System.out.print(newMatrix[i][j] + " \t\t");
            }
            System.out.println('\n');
        }
    }
}
