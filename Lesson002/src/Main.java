import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        while (userGuess != target) {
            int n = s.nextInt();
            if (n < target) {
                System.out.println("Ваше число меньше");
            }
            else if (n > target) {
                System.out.println("Ваше число больше");
            } else {
                System.out.println("Правильный ответ");
                break;
            }
        }
        // Считывайте числа от пользователя пока не найдёте число, равное target
    }
}