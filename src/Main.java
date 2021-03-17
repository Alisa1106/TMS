public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD Athlon(tm) II X3 445 Processor, 3100 МГц, 3 ядра",
                8, 1, 500_000);
        computer.specification();
        computer.turnOn();
        computer.turnOff();
    }
}
