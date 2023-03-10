import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<ItemPopularityComparator.Item> {

    public static void main(String[] args){

    }

    @Override
    public int compare(Item item1, Item item2) {

        // Напишите правильное сравнение.
        return item2.popularity- item1.popularity;
    }

    static class Item {

        public final String name;
        public final int price;
        public final int popularity;

        public Item(String name, int price, int popularity) {
            this.name = name;
            this.price = price;
            this.popularity = popularity;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", popularity=" + popularity +
                    '}';
        }
    }
}