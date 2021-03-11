public class Athlete {
    public static void main(String[] args) {
        double dayDistance = 10.0;
        double totalDistance = 0;
        for (int i = 1; i <= 7; i++) {
            totalDistance += dayDistance;
            dayDistance += dayDistance * 0.1;
        }
        System.out.println("За 7 дней спортсмен пробежит " + totalDistance + " километра");
    }
}
