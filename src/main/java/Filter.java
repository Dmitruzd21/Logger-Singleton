import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    private int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        result = list.stream().filter(x ->
        {
            if (x > threshold) {
                logger.log("Элемент " + x + " не проходит");
                return false;
            } else {
                logger.log("Элемент " + x + " проходит");
                return true;
            }
        }).collect(Collectors.toList());
        logger.log("Прошло " + result.size() + " элементов из " + list.size());
        return result;
    }
}
