public class TwoArrays_5 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        double sumFirstArrayElements = 0;
        double sumSecondArrayElements = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 16);
            sumFirstArrayElements += firstArray[i];
            System.out.print(firstArray[i] + " \t");
        }
        System.out.println("\n");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 16);
            sumSecondArrayElements += secondArray[i];
            System.out.print(secondArray[i] + " \t");
        }
        System.out.println("\n");
        if (sumFirstArrayElements / firstArray.length > sumSecondArrayElements / secondArray.length) {
            System.out.println("Среднее арифметическое элементов первого массива больше, чем второго");
        } else if (sumFirstArrayElements / firstArray.length < sumSecondArrayElements / secondArray.length) {
            System.out.println("Среднее арифметическое элементов второго массива больше, чем первого");
        } else {
            System.out.println("Средние арифметические элементов двух массивов равны");
        }
    }
}
