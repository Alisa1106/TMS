public class MilitaryPlane extends AirTransport {

    private boolean ejectionSystem;
    private int amountOfMissilesOnBoard;

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public int getAmountOfMissilesOnBoard() {
        return amountOfMissilesOnBoard;
    }

    @Override
    void printInformation() {
        super.printInformation();
        if (ejectionSystem) {
            System.out.println("Имеет систему катапультирования");
        } else {
            System.out.println("Система катапультирования отсутствует");
        }
        System.out.println("Количество ракет на борту: " + amountOfMissilesOnBoard + " шт.\n");
    }

    public MilitaryPlane(double power, int maximumSpeed, double weight, String brand, double wingspan,
                         double minimumRunwayLength, boolean ejectionSystem, int amountOfMissilesOnBoard) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.amountOfMissilesOnBoard = amountOfMissilesOnBoard;
    }

    void shot() {
        if (amountOfMissilesOnBoard > 0) {
            System.out.println("Ракета пошла...\n");
            amountOfMissilesOnBoard--;
            return;
        }
        if (amountOfMissilesOnBoard == 0) {
            System.out.println("Боеприпасы отсутствуют\n");
            return;
        }
    }

    void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно!\n");
            return;
        }
        if (!ejectionSystem) {
            System.out.println("У вас нет такой системы\n");
            return;
        }
    }
}
