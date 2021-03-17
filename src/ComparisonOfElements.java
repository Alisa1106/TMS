public class ComparisonOfElements {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
        }
        System.out.println("\n");
        boolean found = true;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {      //ничего лучше не придумала)
                if (intArray[j] == intArray[i] && j != i) {
                    found = false;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Все элементы массива различны");
        } else {
            System.out.println("В массиве есть одинаковые элементы");
        }
    }
}
//        6) Проверить, различны ли все элементы массива.
