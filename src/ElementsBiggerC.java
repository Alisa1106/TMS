public class ElementsBiggerC {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int c = 4;
        double sumOfElementsBiggerC = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] > c) {
                sumOfElementsBiggerC += intArray[i];
            }
        }
        System.out.println("\n");
        System.out.println("Среднее арифметическое элементов массива, которые больше с равно: "
                + sumOfElementsBiggerC / intArray.length + "\n");
    }
}
// 3) Найти средне арифметическое элементов массива, превосходящих некоторое
//    число С.