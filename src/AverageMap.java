import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageMap {

    // zwróc mape z imieniem i średnia ocen ucznia, dane wejsciowe to mapa z imieniem i ocenami ucznia

    public static Map<String, Double> studentAverages(Map<String, List<Integer>> grades) {
        Map<String, Double> avg = new HashMap<>();

//        for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
//            double average = entry.getValue().stream()
//                    .mapToInt(Integer::intValue)
//                    .average()
//                    .orElse(0);
//            avg.put(entry.getKey(), average);
//        }
        avg = grades.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0)
                ));
        return avg;
    }

    //znajdz uczniów powyzej sredniej
    public static List<String> aboveAverage(Map<String, Integer> scores) {
        List<String> students = new ArrayList<>();
        double avg = scores.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
//        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
//            if (entry.getValue() > avg){
//                students.add(entry.getKey());
//            }
//        }
        return scores.entrySet().stream()
                .filter(e -> e.getValue() > avg)
                .map(Map.Entry::getKey)
                .toList();
    }

}
