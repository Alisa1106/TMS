public class Triangle {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 15;
        if (a > (b + c)) {
            System.out.println("Такого треугольника не существует!");
        } else if (b > (a + c)) {
            System.out.println("Такого треугольника не существует!");
        } else if (c > (a + b)) {
            System.out.println("Такого треугольника не существует!");
        } else {
            System.out.println("Этот треугольник существует!");
        }
    }
}
