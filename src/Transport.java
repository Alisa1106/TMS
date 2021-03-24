public abstract class Transport {

    private double power;
    private int maximumSpeed;
    private double weight;
    private String brand;

    public double getPower() {
        return power;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public void printInformation() {
        System.out.println("Мощность двигателя: " + power + " лс.");
        System.out.println("Мощность в киловаттах: " + getPowerInKilowatts(power) + " кВт.");
        System.out.println("Максимальная скорость: " + maximumSpeed + " км/ч.");
        System.out.println("Масса: " + weight + " кг.");
        System.out.println("Бренд: " + brand);
    }

    public Transport(double power, int maximumSpeed, double weight, String brand) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    private double getPowerInKilowatts(double power) {
        return power * 0.74;
    }
}
