import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public void start() {

        Shop shop = new Shop();
        shop.addGoods(new Goods(1, "Phone", 1_000));
        shop.addGoods(new Goods(2, "Laptop", 3_000));
        shop.addGoods(new Goods(3, "Computer", 2_800));
        shop.addGoods(new Goods(1, "Phone", 2_000));
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Выберите действие: \n1 - Вывод всех товаров\n2 - Добавление товара\n" +
                        "3 - Удаление товара\n4 - Редактирование товара\n5 - Выход\nВаш выбор: ");
                int choice = scanner.nextInt();
                while (choice < 1 || choice > 5) {
                    System.out.print("Вы ввели некорректное число. Повторите ввод: ");
                    choice = scanner.nextInt();
                }
                switch (choice) {
                    case 1:
                        System.out.print("Отсортировать: \n1 - по возрастанию цены\n2 - по убыванию цены\n" +
                                "3 - подобавлению (сначала новые)\nВаш выбор: ");
                        int sort = scanner.nextInt();
                        while (sort < 1 || sort > 3) {
                            System.out.print("Вы ввели некорректное число. Повторите ввод: ");
                            sort = scanner.nextInt();
                        }
                        switch (sort) {
                            case 1:
                                System.out.println(shop.getGoodsList().stream().sorted(Comparator.comparing
                                        (Goods::getPrice)).collect(Collectors.toList()));
                                break;
                            case 2:
                                System.out.println(shop.getGoodsList().stream().sorted(Comparator.comparing
                                        (Goods::getPrice).reversed()).collect(Collectors.toList()));
                                break;
                            case 3:
                                List<Goods> copyOfList = (ArrayList<Goods>) shop.getGoodsList().clone();
                                Collections.reverse(copyOfList);
                                System.out.println(copyOfList);
                                break;
                        }
                        break;
                    case 2:
                        Goods goods6 = new Goods();
                        System.out.print("Введите ID товара: ");
                        goods6.setId(scanner.nextInt());
                        System.out.print("Введите название товара: ");
                        goods6.setName(scanner.next());
                        System.out.print("Введите стоимость товара: ");
                        goods6.setPrice(scanner.nextInt());
                        shop.addGoods(goods6);
                        break;
                    case 3:
                        System.out.print("Введите ID товара: ");
                        shop.deleteGoods(scanner.nextInt());
                        break;
                    case 4:
                        Goods goods7 = new Goods();
                        System.out.print("Введите ID товара: ");
                        goods7.setId(scanner.nextInt());
                        System.out.print("Введите название товара: ");
                        goods7.setName(scanner.next());
                        System.out.print("Введите стоимость товара: ");
                        goods7.setPrice(scanner.nextInt());
                        shop.editGoodsList(goods7);
                        break;
                    case 5:
                        System.out.println("Вы покинули магазин.");
                        return;
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели недопустимые символы!");
            }
        }
    }
}
