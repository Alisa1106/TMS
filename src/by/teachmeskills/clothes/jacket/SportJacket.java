package by.teachmeskills.clothes.jacket;

public class SportJacket implements IJacket {

    public SportJacket() {
    }

    @Override
    public void putOn() {
        System.out.print(" надевает спортивную куртку, ");
    }

    @Override
    public void takeOff() {
        System.out.print(" снимает спортивную куртку, ");
    }
}
