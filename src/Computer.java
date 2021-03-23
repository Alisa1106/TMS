import java.util.Scanner;

public class Computer {

    String cpu;
    int ram;
    int ssd;
    int workCyclesRemaining;
    boolean turnedOn = false;
    boolean broken = false;
    Scanner scanner = new Scanner(System.in);

    public Computer(String cpu, int ram, int ssd, int workCyclesRemaining) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.workCyclesRemaining = workCyclesRemaining;
    }

    void printSpecification() {
        System.out.println("Процессор: " + cpu + "\nОперативка: " + ram
                + "\nОбъём жёсткого диска: " + ssd + "\nРесурс полных циклов работы: " + workCyclesRemaining);
    }

    void turnOn() {
        if (broken) {
            System.out.println("Компьютер сгорел(((");
            return;
        }
        if (workCyclesRemaining == 0) {
            System.out.println("Ресурс работы исчерпан, компьютер сгорел");
            return;
        }
        if (turnedOn) {
            System.out.println("Компьютер включён!");
            return;
        }
        int random = (int) (Math.random() * 2);
        System.out.println(random);
        System.out.print("Произошёл сбой. Введите число 0 или 1: ");
        int enteredNumber = scanner.nextInt();
        if (enteredNumber == random) {
            turnedOn = true;
            System.out.println("Добро пожаловать!");
        } else {
            broken = true;
            System.out.println("Компьютер сгорел(((");
        }
    }

    void turnOff() {
        if (broken) {
            System.out.println("Компьютер сгорел(((");
            return;
        }
        if (!turnedOn) {
            System.out.println("Компьютер выключен!");
            return;
        }
        int random = (int) (Math.random() * 2);
        System.out.println(random);
        System.out.print("Произошёл сбой. Введите число 0 или 1: ");
        int enteredNumber = scanner.nextInt();
        if (enteredNumber == random) {
            turnedOn = false;
            workCyclesRemaining--;
            System.out.println("Завершение работы...");
        } else {
            broken = true;
            System.out.println("Компьютер сгорел(((");
        }
    }
}
