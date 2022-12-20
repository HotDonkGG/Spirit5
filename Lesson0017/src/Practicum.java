import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Practicum {
    private static List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        // переменная uniquePurchases должна содержать множество уникальных товаров



        // допишите вывод количества уникальных товаров
        System.out.println( "За месяц было куплено " + findUniquePurchases(allPurchases).size() + " уникальных товаров.");
    }

    // реализуйте этот метод
    public static Set<String> findUniquePurchases(List<String> allPurchases) {
      return new HashSet<>(allPurchases);

        }
}