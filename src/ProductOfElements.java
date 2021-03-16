public class ProductOfElements {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int productOfElements = 1;
        int counterOfMultiplesOfThree = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] % 3 == 0) {
                counterOfMultiplesOfThree++;
                productOfElements *= intArray[i];
            }
        }
        System.out.println("\n");
        if (counterOfMultiplesOfThree > 0) {
            System.out.println("Произведение элементов массива, кратных трём равно: "
                    + productOfElements + "\n");
        } else {
            System.out.println("Здесь нет элементов, кратных трём");
        }
    }
}
//1) Найти произведение элементов, кратных 3.