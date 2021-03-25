package by.teachmeskills.clothes.pants;

public class Jeans implements IPants {

    public Jeans() {
    }

    @Override
    public void putOn() {
        System.out.print("надевает джинсы, ");
    }

    @Override
    public void takeOff() {
        System.out.print("снимает джинсы, ");
    }
}
