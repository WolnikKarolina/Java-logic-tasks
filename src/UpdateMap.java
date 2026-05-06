import java.util.HashMap;
import java.util.Map;

public class UpdateMap {
    public static Map<String, Integer> updateInventory(Map<String, Integer> inventory, Map<String, Integer> delivery){
        Map<String, Integer> update = new HashMap<>();
        update.putAll(inventory);
        for (Map.Entry<String, Integer> entry : delivery.entrySet()) {
            update.merge(entry.getKey(), entry.getValue(), Integer::sum );
        }
        return update;
    }

}
