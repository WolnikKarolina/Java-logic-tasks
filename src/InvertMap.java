import java.util.HashMap;
import java.util.Map;

public class InvertMap {

    public static Map<Integer, String> invertMap(Map<String, Integer> map){
        Map<Integer, String> inv = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            inv.put(entry.getValue(), entry.getKey());
        }
        return inv;
    }
}
