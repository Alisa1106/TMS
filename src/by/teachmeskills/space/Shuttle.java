package by.teachmeskills.space;

public class Shuttle implements IStart {

    @Override
    public boolean preLaunchCheck() {
        int random = (int) (Math.random() * 11);
        if (random > 3) {
            return true;
        }
        return false;
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
