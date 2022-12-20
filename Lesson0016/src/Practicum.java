import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Practicum {
    private static Map<Integer, User> users = new HashMap();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (int i = 1; i <= 1_000_000L; i++) {
            String name = "Имя " + i;
            User user = new User(i, name);
            users.put(i, user);
        }

        final long startTime = System.nanoTime();
        User user = findUser(20);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(long userId) {
        return users.get((int)userId);
    }


static class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}
}