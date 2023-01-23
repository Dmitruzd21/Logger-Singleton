import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> randomIntList = createRandomIntList(size, maxValue);
        System.out.println("Вот случайный список:" + randomIntList.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int threshold = scanner.nextInt();
        Filter filter = new Filter(threshold);
        List<Integer> filteredList = filter.filterOut(randomIntList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList.toString());
        logger.log("Завершаем программу");
    }

    public static List<Integer> createRandomIntList(int size, int maxValue) {
        Random random = new Random();
        List<Integer> randomIntList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomIntList.add(random.nextInt(maxValue));
        }
        return randomIntList;
    }
}
