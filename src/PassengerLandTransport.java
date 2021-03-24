public class PassengerLandTransport extends LandTransport {

    private String bodyType;
    private int maxAmountOfPassengers;
    private double travelTime;

    public String getBodyType() {
        return bodyType;
    }

    public int getMaxAmountOfPassengers() {
        return maxAmountOfPassengers;
    }

    public double getTravelTime() {
        return travelTime;
    }

    @Override
    public void printInformation() {
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

    public void printDistanceAndFuelConsumptionPerTravel(double travelTime) {
        double distance = getMaximumSpeed() * travelTime;
        System.out.println("За время " + travelTime + " ч. автомобиль " + getBrand()
                + " двигаясь с максимальной скоростью " + getMaximumSpeed() + " км/ч. проедет " + distance
                + " км. и израсходует " + getFuelConsumptionPerTravel(distance) + " л. топлива\n");
    }

    private double getFuelConsumptionPerTravel(double distance) {
        return getFuelConsumption() / 100 * distance;
    }
}
