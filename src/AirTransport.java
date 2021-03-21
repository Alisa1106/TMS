public abstract class AirTransport extends Transport {

    private double wingspan;
    private double minimumRunwayLength;

    public double getWingspan() {
        return wingspan;
    }

    public double getMinimumRunwayLength() {
        return minimumRunwayLength;
    }

    @Override
    void printInformation() {
        super.printInformation();
        System.out.println("Размах крыльев: " + wingspan + " м.");
        System.out.println("Минимальная длина взлётно-посадочной полосы, необходимая для взлёта: "
                + minimumRunwayLength + " м.");
    }

    public AirTransport(double power, int maximumSpeed, double weight, String brand, double wingspan,
                        double minimumRunwayLength) {
        super(power, maximumSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLength = minimumRunwayLength;
    }
}
