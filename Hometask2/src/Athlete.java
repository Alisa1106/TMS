public class Athlete {
    public static void main(String[] args) {
        double dayDistance = 10.0;
        double totalDistance = 0;
        int days = 1;
        while (days <= 7) {
            totalDistance += dayDistance;
            dayDistance += dayDistance * 0.1;
            days++;
        }
        System.out.println("За 7 дней спортсмен пробежит " + totalDistance + " километра");
    }
}
