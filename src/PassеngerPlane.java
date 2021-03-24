public class PassеngerPlane extends AirTransport {

    private int maxAmountOfPassengers;
    private boolean businessClass;
    private int amountOfPassengers;

    public int getMaxAmountOfPassengers() {
        return maxAmountOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Вмещает пассажиров: " + maxAmountOfPassengers);
        if (businessClass) {
            System.out.println("Есть бизнес-класс\n");
            return;
        }
        System.out.println("Бизнес-класс отсутствует\n");
    }

    public PassеngerPlane(double power, int maximumSpeed, double weight, String brand, double wingspan,
                          double minimumRunwayLength, int maxAmountOfPassengers, boolean businessClass) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLength);
        this.maxAmountOfPassengers = maxAmountOfPassengers;
        this.businessClass = businessClass;
    }

    public void passengerCapacityCheck(int amountOfPassengers) {
        if (amountOfPassengers <= maxAmountOfPassengers) {
            System.out.println("Посадка пассажиров завершена\n");
        } else {
            System.out.println("Вам нужен самолёт побольше\n");
        }
    }
}
