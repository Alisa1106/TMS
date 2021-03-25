package by.teachmeskills.space;

public class VectorR implements IStart {

    @Override
    public boolean preLaunchCheck() {
        int random = (int) (Math.random() * 11);
        if (random % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void enginesLaunch() {
        System.out.println("Двигатели Vector-R запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Vector-R");
    }
}
