import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map = new HashMap<>();
        map.putAll(map1); // kopiuje całą mapę za pierwszym razem
//        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
//            map.put(entry.getKey(), entry.getValue());
//        }
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            map.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return map;
    }
}
