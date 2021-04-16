package kg.megacom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        books.add("Над пропастью во ржи");
        books.add("Зулейха открывает глаза");
        books.add("Таинственная история Билли Милигана");
        books.add("451 градус по Фаренгейту");
        books.add("Норвежский лес");
        System.out.println(books);

        books.remove(4);
        System.out.println("---------------");
        System.out.println(books);

        books.set(3, "Норвежский лес");
        System.out.println("---------------");

        String norwegianWood = books.get(3);
        System.out.println(norwegianWood);

        books.clear();

        books.add("Цветы для Элджернона");
        books.add("Страна Чудес без тормозов и Конец Света");
        books.add("Вероника решает умереть");
        System.out.println("---------------");
        System.out.println(books);







    }
}
