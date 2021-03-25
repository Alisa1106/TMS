package by.teachmeskills.clothes.footwear;

public class Shoes implements IFootwear {

    public Shoes() {
    }

    @Override
    public void putOn() {
        System.out.println("надевает туфли");
    }

    @Override
    public void takeOff() {
        System.out.println("снимает туфли");
    }
}
