public class Triangle {
    public static void main(String[] args) {
        int a = 25;
        int b = 12;
        int c = 15;
        if (a >= b + c | b >= a + c | c >= a + b) {
            System.out.println("Такого треугольника не существует!");
        } else {
            System.out.println("Этот треугольник существует!");
        }
    }
}
