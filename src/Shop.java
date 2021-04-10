import java.util.*;

public class Shop {

    Set<Goods> goodsList = new HashSet<>();

    public void addGoods(Goods goods) {
        if (goodsList.add(goods)) {
            System.out.println("Товар добавлен.");
        } else {
            System.out.println("Товар с таким ID уже существует!");
        }
    }

    public ArrayList<Goods> getGoodsList() {
        return new ArrayList<>(goodsList);
    }

    public void deleteGoods(int id) {
        Goods goods = new Goods(id);
        if (goodsList.remove(goods)) {
            System.out.println("Товар удалён");
        } else {
            System.out.println("Товар с таким ID отсутствует");
        }
    }

    public void editGoodsList(Goods goods) {
        if (goodsList.remove(goods) && goodsList.add(goods)) {
            System.out.println("Товар отредактирован.");
        } else {
            System.out.println("Товар с таким ID отсутствует");
        }
    }
}

