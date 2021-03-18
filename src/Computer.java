import java.util.Scanner;

public class Computer {

    String processor;
    int ram;
    int hdd;
    int fullCycleLife;
    int counterOfOn = 0;
    int counterOfOff = 0;

    public Computer(String processor, int ram, int hdd, int fullCycleLife) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.fullCycleLife = fullCycleLife;
    }

    void specification() {
        System.out.println("Процессор: " + processor + "\nОперативка: " + ram
                + "\nОбъём жёсткого диска: " + hdd + "\nРесурс полных циклов работы: " +fullCycleLife);
    }

    boolean checkFailure() {
        boolean result = true;
        int random = (int) (Math.random() * 5);
        if (random == 0) {
            result = false;
        }
        return result;
    }

    boolean isFailure() {
        int random = (int) (Math.random() * 1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Произошёл сбой. Введите число 0 или 1: ");
        int enteredNumber = scanner.nextInt();
        while (enteredNumber < 0 || enteredNumber > 1) {
            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
            enteredNumber = scanner.nextInt();
        }
        boolean broken = false;
        if (random != enteredNumber || checkResourceOfWork()) {
            broken = true;
        }
        return broken;
    }

     void turnOn() {
        if (checkFailure()) {
            counterOfOn++;
            System.out.println("Добро пожаловать!");
        } else if (isFailure()) {
            System.out.println("Компьютер сгорел(((");
        } else {
            turnOff();
        }
    }

     void turnOff() {
        if (checkFailure()) {
            counterOfOff++;
            System.out.println("Завершение работы...");
        } else if (isFailure()) {
            System.out.println("Компьютер сгорел(((");
        } else {
            counterOfOff++;
            System.out.println("Завершение работы...");
        }
    }

    boolean checkResourceOfWork() {
        boolean exceedingResourceOfWork = false;
        if (counterOfOn >= fullCycleLife && counterOfOff >= fullCycleLife) {
            exceedingResourceOfWork = true;
        }
        return exceedingResourceOfWork;
    }
}
//    Создать класс компьютер.
//        Поля:
//        - процессор
//        - оперативка
//        - жесткий диск
//        - ресурс полных циклов работы (включений/выключений)
//        Методы:
//        - метод описание(вывод всех полей)
//        - метод включить, при включении может произойти сбой, при вывзове метода
//        рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
//        угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке
//        включить нужно выдать сообщение что ему конец
//        - выключить (аналогично включению)
//        - при превышении лимита ресурса комп сгорает