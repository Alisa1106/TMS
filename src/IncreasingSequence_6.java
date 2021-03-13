public class IncreasingSequence_6 {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        boolean found = true;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < intArray.length; i++) {
            if (i > 0 && intArray[i - 1] >= intArray[i]) {
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Это строго возрастающая последовательность");
        } else {
            System.out.println("Этот массив не является строго возрастающей последовательностью");
        }
    }
}
