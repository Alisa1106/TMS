public class Main {
    public static void main(String[] args) {

        PassengerLandTransport car = new PassengerLandTransport(180, 250, 2_000, "Audi", 4,
                9, "coupe", 5);
        FreightLandTransport truck = new FreightLandTransport(750, 140, 8_000, "Volvo", 10,
                20, 325);
        PassеngerPlane passengerPlane = new PassеngerPlane(30_000, 1_000, 16_000, "Boeing",
                60, 3_000, 360, true);
        MilitaryPlane militaryPlane = new MilitaryPlane(60_000, 3_000, 1_400, "Boeing",
                1.5, 500, true, 10);

        car.printInformation();
        truck.printInformation();
        passengerPlane.printInformation();
        militaryPlane.printInformation();
        car.printDistanceAndFuelConsumptionPerTravel(2.5);
        truck.capacityCheck(200);
        passengerPlane.passengerCapacityCheck(100);
        militaryPlane.shot();
        militaryPlane.ejection();
    }
}
