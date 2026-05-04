import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentWord {
    //Napisz metodę która znajdzie najczęściej występujące słowo w liście słów
    public String mostFrequentWord(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.merge(s, 1, Integer::sum);
        }
        //int max = 0;
        //String result = "";
        //for (Map.Entry<String, Integer> s : map.entrySet()) {
        //    if (s.getValue() > max) {
        //        max = s.getValue();
       //         result = s.getKey();
        //    }
        //}
        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).map(Map.Entry::getKey).orElse(null);

    }
}
