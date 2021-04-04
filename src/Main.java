public class Main {

    public static void main(String[] args) {

        Application application = new Application();

        application.start();
    }
}
//    Алгоритм работы магазина:1
//        • Выберите действие:
//        ◦ Вывод всех товаров. При выборе этого действия, было бы отлично
//        спросить у пользователя в какой сортировке вывести:
//        ▪ по цене(возрастание)
//        ▪ по цене(убывание)
//        ▪ по добавлению(сначала новые, потом более старые)
//        После выбора сортировки, из магазина получаете список товаров,
//        сортируете их таким образом как выбрал пользователь и выводите в
//        консоль.
//        ◦ Добавление товара. При выборе этого действия:
//        ▪ пользователь должен ввести из консоли 3 параметра (id, название,
//        цена).
//        ▪ создаем объект товара(поля заполняются данными введенными
//        пользователем)
//        ▪ добавляем товар в магазин(напоминаю, если в списке товаров уже
//        существует товар с таким id, то новый товар не добавляется)
//        ◦ Удаление товара. При выборе этого действия:
//        ▪ пользователь вводит id товара который нужно удалить
//        ▪ удаляем товар из магазина
//        ◦ Редактирование товара. При выборе этого действия:
//        ▪ пользователь должен ввести из консоли 3 параметра (id товара для
//        редактирования, новое название, новую цену).
//        ▪ создаем объект товара(поля заполняются данными введенными
//        пользователем)
//        ▪ редактируем товар в магазине
//        ◦ Выход. При выборе этого действия, работа магазина завершается.
//        В main создаем объект вашей консольной менюшки(приложения,
//        Application). И вызываем метод старт. Магазин должен работать по замкнутому
//        циклы, до тех пор пока пользователь в меню не выберет выход. Естественно
//незабываем про обработку всевозможных ошибок. Успехов!))