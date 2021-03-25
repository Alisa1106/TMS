package by.teachmeskills.clothes;

import by.teachmeskills.clothes.footwear.Shoes;
import by.teachmeskills.clothes.footwear.Trainers;
import by.teachmeskills.clothes.jacket.LeatherJacket;
import by.teachmeskills.clothes.jacket.SportJacket;
import by.teachmeskills.clothes.pants.Jeans;
import by.teachmeskills.clothes.pants.Trousers;

public class Main {
    public static void main(String[] args) {

        LeatherJacket leatherJacket = new LeatherJacket();
        SportJacket sportJacket = new SportJacket();
        Jeans jeans = new Jeans();
        Trousers trousers = new Trousers();
        Shoes shoes = new Shoes();
        Trainers trainers = new Trainers();
        Person person = new Person("Вася", leatherJacket, jeans, shoes);

        person.getDressed();
        person.undress();
    }
}
//    По аналогии с первым задание делаем след. задание.
//        Интерфейсы:
//        - Куртка
//        - Штаны
//        - Обувь
//        в каждом интерфейсе есть 2 метода (надеть и снять)
//        Делаем несколько реализации каждого интерфейса.
//        Создаём класс человек:
//        У человека поля:
//        -имя
//        -куртка
//        -штаны
//        -обувь
//        У человека есть 2 метода:
//        - одеться(вызываются методы надетьдеть у всех вещей)
//        - раздеться (вызываются методы снять у всех вещей)
