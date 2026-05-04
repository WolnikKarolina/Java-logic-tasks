import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordsMap {

    public static Map<String, Integer> countWords(List<String> words){
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);

        }
        return map;
    }

    static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("jabłko");
        list.add("banan");
        list.add("jabłko");



        System.out.println(CountWordsMap.countWords(list));

    }
}
