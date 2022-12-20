import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<String> cats = new ArrayList<>();

        cats.add("Маркиз");
        cats.add("Принцесса");
        cats.add("Пирожок");
        cats.add("Мурка");
        cats.set(1, "Пирожок");
        cats.set(2, "Лев");
        cats.remove(3);

        System.out.println(cats); // сейчас печатается [Маркиз, Принцесса, Пирожок, Мурка]
    }
}