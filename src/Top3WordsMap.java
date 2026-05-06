import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3WordsMap {
    public static List<String> top3Words(String text){
        Map<String, Integer> map = new HashMap<>();
        String[] tab = text.split(" ");

        for (String s : tab) {
            map.merge(s, 1, Integer::sum );
        }
        List<String> limit = map.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed())
                .map(Map.Entry::getKey)
                .limit(3)
                .toList();
        return limit;
    }
}
