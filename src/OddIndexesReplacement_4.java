public class OddIndexesReplacement_4 {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 21);
            System.out.print(intArray[i] + "\t");
        }
        System.out.println("\n");
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
               intArray[i] = 0;
            }
            System.out.print(intArray[i] + "\t");
        }
    }
}
