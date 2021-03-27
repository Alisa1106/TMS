package by.teachmeskills.space;

public class SpaceX implements IStart {

    @Override
    public boolean preLaunchCheck() {
        int random = (int) (Math.random() * 100);
        return (random > 10 && random < 70);
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
