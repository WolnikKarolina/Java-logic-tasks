import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupNumbersMap {
    public static Map<String, List<Integer>> groupNumbers(List<Integer> numbers){
        Map<String, List<Integer>> map = new HashMap<>();

        for (Integer n : numbers) {
            String key = "";
            if ( n == 0){
                key = "Zero";
            } else if (n > 0) {
                key = "Positive";
            }else if (n < 0) {
                key = "Negative";
            }
            List<Integer> list = map.getOrDefault(key, new ArrayList<>());
            list.add(n);
            map.put(key, list);

        }
        return map;
    }

    static void main(String[] args) {
        List<Integer> list = List.of(1, -3, 5, -2, 0, 8, -7, 0, 3);
        Map<String, List<Integer>> map = GroupNumbersMap.groupNumbers(list);
        map.entrySet().forEach(System.out::println);
    }
}
