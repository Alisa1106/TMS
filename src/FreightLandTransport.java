public class FreightLandTransport extends LandTransport {

    private double capacity;
    private double freightWeight;

    public double getCapacity() {
        return capacity;
    }

    public double getFreightWeight() {
        return freightWeight;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Грузоподъёмность: " + capacity + " т.\n");
    }

    public FreightLandTransport(double power, int maximumSpeed, double weight, String brand, int amountOfWheels,
                                double fuelConsumption, double capacity) {
        super(power, maximumSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.capacity = capacity;
    }

    public void capacityCheck(double freightWeight) {
        if (freightWeight <= capacity) {
            System.out.println("Грузовик загружен\n");
        } else {
            System.out.println("Вам нужен грузовик побольше\n");
        }
    }
}
