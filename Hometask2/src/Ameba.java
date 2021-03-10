public class Ameba {
    public static void main(String[] args) {
        int amountOfCells = 1;
        int hours = 3;
        while (hours <= 24) {
            amountOfCells *= 2;
            System.out.print("Через " + hours);
            if (hours % 10 == 1) {
                System.out.print(" час");
            } else if (hours % 10 >= 2 && hours % 10 <= 4 && (hours % 100 < 10 || hours % 100 > 20)) {
                System.out.print(" часа");
            } else {
                System.out.print(" часов");
            }
            hours += 3;
            System.out.print(" будет " + amountOfCells);
            if (amountOfCells % 10 >= 2 && amountOfCells % 10 <= 4 && (amountOfCells % 100 < 10 || amountOfCells % 100 > 20)) {
                System.out.println(" амёбы");
            } else {
                System.out.println(" амёб");
            }
        }
    }
}
