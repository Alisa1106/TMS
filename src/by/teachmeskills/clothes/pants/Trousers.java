package by.teachmeskills.clothes.pants;

public class Trousers implements IPants {

    public Trousers() {
    }

    @Override
    public void putOn() {
        System.out.print("надевает брюки, ");
    }

    @Override
    public void takeOff() {
        System.out.print("снимает брюки, ");
    }
}
