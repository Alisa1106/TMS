package by.teachmeskills.space;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunchCheck() {
        int random = (int) (Math.random() * 11);
        return (random > 3);
    }

    @Override
    public void enginesLaunch() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
