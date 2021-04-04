import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Shop {

    Map<Integer, Goods> goodsList = new HashMap<>();
    HashSet<Integer> keySet = new HashSet<>();

    public void addGoods(Goods goods) {
        if (keySet.add(goods.getId())) {
            goodsList.put(goods.getId(), goods);
            System.out.println("Товар добавлен.");
        } else {
            System.out.println("Товар с таким ID уже существует!");
        }
    }

    public ArrayList<Goods> getGoodsList() {
        return new ArrayList<>(goodsList.values());
    }

    public void deleteGoods(int id) {
        if (goodsList.containsKey(id)) {
            goodsList.remove(id);
            System.out.println("Товар удалён");
        } else {
            System.out.println("Товар с таким ID отсутствует");
        }
    }

    public void editGoodsList(Goods goods) {
        if (!keySet.add(goods.getId())) {
            goodsList.put(goods.getId(), goods);
            System.out.println("Товар отредактирован.");
        } else {
            System.out.println("Товар с таким ID отсутствует");
        }
    }
}

