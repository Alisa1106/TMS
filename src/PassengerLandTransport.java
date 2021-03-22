import java.util.Scanner;

public class PassengerLandTransport extends LandTransport {

    private String bodyType;
    private int maxAmountOfPassengers;
    Scanner scanner = new Scanner(System.in);

    public String getBodyType() {
        return bodyType;
    }

    public int getMaxAmountOfPassengers() {
        return maxAmountOfPassengers;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Вмещает пассажиров: " + maxAmountOfPassengers + "\n");
    }

    public PassengerLandTransport(double power, int maximumSpeed, double weight, String brand, int amountOfWheels,
                                  double fuelConsumption, String bodyType, int maxAmountOfPassengers) {
        super(power, maximumSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.maxAmountOfPassengers = maxAmountOfPassengers;
    }

    void printDistanceAndFuelConsumptionPerTravel() {
        System.out.print("Введите время поездки: ");
        double travelTime = scanner.nextDouble();
        double distance = getMaximumSpeed() * travelTime;
        System.out.println("За время " + travelTime + " ч. автомобиль " + getBrand()
                + " двигаясь с максимальной скоростью " + getMaximumSpeed() + " км/ч. проедет " + distance
                + " км. и израсходует " + getFuelConsumptionPerTravel(distance) + " л. топлива\n");
    }

    private double getFuelConsumptionPerTravel(double distance) {
        double fuelConsumptionPerTravel = getFuelConsumption() / 100 * distance;
        return fuelConsumptionPerTravel;
    }
}
