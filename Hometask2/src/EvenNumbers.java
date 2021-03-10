public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Все чётные числа от 2 до 100: ");
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
    }
}
