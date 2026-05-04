import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesMap {

    // wyświetl liste słów które pojawiają sie więcej niż raz
    public static List<String> findDuplicates(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }
        List<String> duplicates = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if ( entry.getValue() > 1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    static void main() {
        List<String> words = List.of(
                "apple", "banana", "apple", "orange", "banana",
                "kiwi", "mango", "kiwi", "grape", "apple"
        );
        System.out.println(FindDuplicatesMap.findDuplicates(words));
    }
}
