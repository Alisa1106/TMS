public class ThreeArrays_8 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];
        int amountOfIntegers = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
            System.out.print(firstArray[i] + " \t");
        }
        System.out.println("\n");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 10);
            System.out.print(secondArray[i] + " \t");
        }
        System.out.println("\n");
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (double) firstArray[i] / secondArray[i];
            System.out.print(thirdArray[i] + " \t");
            if (thirdArray[i] % 1 == 0) {
                amountOfIntegers++;
            }
        }
        System.out.println("\n");
        System.out.println("Количество целых элементов в третьем массиве: " + amountOfIntegers);
    }
}
