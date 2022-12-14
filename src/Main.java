import java.util.Map;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Иванов", "Иван"), "89992134876");
        phoneBook.addPhone(new FullName("Сергеев", "Сергей"), "89605689231");
        phoneBook.addPhone(new FullName("Вагина", "Валентина"), "89028734810");
        phoneBook.addPhone(new FullName("Пупкина", "Екатерина"), "89825193671");
        phoneBook.addPhone(new FullName("Тумбочкин", "Анатолий"), "89082647820");
        phoneBook.addPhone(new FullName("Олегов", "Олег"), "89523281869");
        phoneBook.addPhone(new FullName("Подопригора", "Алексей"), "89082453243");
        phoneBook.addPhone(new FullName("Варивода", "Дмитрий"), "89082721160");
        phoneBook.addPhone(new FullName("Поднимигора", "Елена"), "89523293769");
        phoneBook.addPhone(new FullName("Габов", "Альберт"), "89922041820");
        phoneBook.addPhone(new FullName("Лен", "Тамара"), "89922390893");
        phoneBook.addPhone(new FullName("Скорпионова", "Евгения"), "+79194841616");
        phoneBook.addPhone(new FullName("Сабзирова", "Анастасия"), "89026320534");
        phoneBook.addPhone(new FullName("Ухтынова", "Алена"), "89526402026");
        phoneBook.addPhone(new FullName("Майнезин", "Сергей"), "+79922117928");
        phoneBook.addPhone(new FullName("Провансалев", "Владимир"), "89028070577");
        phoneBook.addPhone(new FullName("Нешатаева", "Людмила"), "89024775531");
        phoneBook.addPhone(new FullName("Рагозин", "Сергей"), "89504551901");
        phoneBook.addPhone(new FullName("Сальникова", "Надежда"), "890263222709");
        phoneBook.addPhone(new FullName("Вайваев", "Зураб"), "9824806782");

        System.out.println("Телефонный справочник:");
        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }


    }
}