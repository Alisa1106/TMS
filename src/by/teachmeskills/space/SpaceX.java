package by.teachmeskills.space;

public class SpaceX implements IStart {

    @Override
    public boolean preLaunchCheck() {
        int random = (int) (Math.random() * 100);
        if (random > 10 && random < 70) {
            return true;
        }
        return false;
    }

    @Override
    public void enginesLaunch() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
