import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public List<Integer> removeDuplicates(List<Integer> list){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
        //return list.stream()
        //            .distinct() usuwa duplikaty
        //            .toList();
    }


   public static void main(String[] args) {
        RemoveDuplicates rm = new RemoveDuplicates();
        List<Integer> list = List.of(10, 10, 10, 5, 7, 7, 3, 1, 1, 2);
        System.out.println(rm.removeDuplicates(list));
   }
}


