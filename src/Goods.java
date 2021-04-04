import java.util.Objects;

public class Goods {

    private int id;
    private String name;
    private int price;

    public Goods(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Goods() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Goods)) {
            return false;
        }
        Goods otherGoods = (Goods) obj;
        return id == otherGoods.id;
    }

    @Override
    public String toString() {
        return "ID товара: " + id + ", его название: " + name + ", его стоимость: " + price + "\n";
    }
}
