package by.teachmeskills.clothes.footwear;

public class Trainers implements IFootwear {

    public Trainers() {
    }

    @Override
    public void putOn() {
        System.out.println(" надевает кроссовки");
    }

    @Override
    public void takeOff() {
        System.out.println(" снимает кроссовки");
    }
}
