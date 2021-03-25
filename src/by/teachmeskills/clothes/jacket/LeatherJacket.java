package by.teachmeskills.clothes.jacket;

public class LeatherJacket implements IJacket {

    public LeatherJacket() {
    }
    @Override
    public void putOn() {
        System.out.print(" надевает кожаную куртку, ");
    }

    @Override
    public void takeOff() {
        System.out.print(" снимает кожаную куртку, ");
    }
}
