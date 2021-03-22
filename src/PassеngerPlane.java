import java.util.Scanner;

public class PassеngerPlane extends AirTransport {

    private int maxAmountOfPassengers;
    private boolean businessClass;
    Scanner scanner = new Scanner(System.in);

    public int getMaxAmountOfPassengers() {
        return maxAmountOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Вмещает пассажиров: " + maxAmountOfPassengers);
        if (businessClass) {
            System.out.println("Есть бизнес-класс\n");
            return;
        }
        if (!businessClass) {
            System.out.println("Бизнес-класс отсутствует\n");
            return;
        }
    }

    public PassеngerPlane(double power, int maximumSpeed, double weight, String brand, double wingspan,
                          double minimumRunwayLength, int maxAmountOfPassengers, boolean businessClass) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLength);
        this.maxAmountOfPassengers = maxAmountOfPassengers;
        this.businessClass = businessClass;
    }

    void passengerCapacityCheck() {
        System.out.print("Введите количество пассажиров: ");
        int amountOfPassengers = scanner.nextInt();
        if (amountOfPassengers <= maxAmountOfPassengers) {
            System.out.println("Посадка пассажиров завершена\n");
            return;
        }
        if (amountOfPassengers > maxAmountOfPassengers) {
            System.out.println("Вам нужен самолёт побольше\n");
            return;
        }
    }
}
