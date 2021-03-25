package by.teachmeskills.space;

public class Spaceport {

    public void launch(IStart iStart) {
        if (!iStart.preLaunchCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.enginesLaunch();
            countDown();
            iStart.start();
        }
    }

    public void countDown() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "... ");
        }
        System.out.println();
    }
}
