import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        Map<String, Integer> seast = new HashMap<>();
        int seat = 1;
        for (int i = 0; i < passengerNames.size(); i++) {
            seast.put(passengerNames.get(i), i);
        }
        seast.forEach();
        return seast;
        // Тут нужно написать код, который будет распределять места в самолёте ✈️
    }
}

