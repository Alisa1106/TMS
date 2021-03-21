public abstract class LandTransport extends Transport {

    private int amountOfWheels;
    private double fuelConsumption;

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Количество колёс: " + amountOfWheels);
        System.out.println("Расход топлива: " + fuelConsumption + " л/100 км.");
    }

    public LandTransport(double power, int maximumSpeed, double weight, String brand,
                         int amountOfWheels, double fuelConsumption) {
        super(power, maximumSpeed, weight, brand);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
