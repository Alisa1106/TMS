import java.util.Scanner;

public class FreightLandTransport extends LandTransport {

    private double capacity;
    Scanner scanner = new Scanner(System.in);

    public double getCapacity() {
        return capacity;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Грузоподъёмность: " + capacity + " т.\n");
    }

    public FreightLandTransport(double power, int maximumSpeed, double weight, String brand, int amountOfWheels,
                                double fuelConsumption, double capacity) {
        super(power, maximumSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.capacity = capacity;
    }

    void capacityCheck() {
        System.out.print("Введите массу груза: ");
        double freightWeight = scanner.nextDouble();
        if (freightWeight <= capacity) {
            System.out.println("Грузовик загружен\n");
        } else {
            System.out.println("Вам нужен грузовик побольше\n");
        }
    }
}
