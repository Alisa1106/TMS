public class RepetitionCounting {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        int valueOfRepeatingElement = 1;
        int counterOfRepeatingElement = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + "\t");
            if (intArray[i] == valueOfRepeatingElement) {
                counterOfRepeatingElement++;
            }
        }
        System.out.println("\n");
        System.out.print("Элемент со значением " + valueOfRepeatingElement + " встречается "
                + counterOfRepeatingElement);
        if (counterOfRepeatingElement % 10 >= 2 && counterOfRepeatingElement % 10 <= 4
                && (counterOfRepeatingElement % 100 < 10 || counterOfRepeatingElement % 100 > 20)) {
            System.out.println(" раза");
        } else {
            System.out.println(" раз");
        }
    }
}
//        7) Подсчитать, сколько раз встречается элемент с заданным значением.
//