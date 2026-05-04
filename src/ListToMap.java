import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
// zmień listę na mapę
    public static Map<String, Integer> listToMap(List<String> words){
        Map<String, Integer> map = new HashMap<>();
//        for (String word : words) {
//            map.put(word, word.length());
//        }
        map = words.stream().collect(Collectors.toMap(k-> k, String::length));
        return map;
    }

    static void main(String[] args) {
        List<String> words = List.of(
                "apple", "orange", "banana",
                "kiwi", "mango", "grape"
        );
        System.out.println(ListToMap.listToMap(words));
    }
}
