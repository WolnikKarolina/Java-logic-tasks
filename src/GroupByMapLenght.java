import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByMapLenght {
    //grupowanie słów po długości
    public Map<Integer, List<String>> groupByLenght(List<String> list) {

        TreeMap<Integer, List<String>> map = new TreeMap<>();

        for (String s : list) {
            List<String> text = map.getOrDefault(s.length(), new ArrayList<>());
            text.add(s);
            map.put(s.length(), text);
        }

        return map;
    }

    // to samo tylko przy pomocy streama
    public Map<Integer, List<String>> groupByLenght2(List<String> list) {
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        return map;
    }


    static void main(String[] args) {
        GroupByMapLenght g = new GroupByMapLenght();
        List<String> list = List.of("cat", "dog", "sun", "tree", "book", "java", "house", "apple", "chair", "hi", "go");

        System.out.println(g.groupByLenght(list));


    }
}

