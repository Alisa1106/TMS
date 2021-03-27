package by.teachmeskills.space;

public class VectorR implements IStart {

    @Override
    public boolean preLaunchCheck() {
        int random = (int) (Math.random() * 11);
        return random % 2 == 0;
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
