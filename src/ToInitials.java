import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToInitials {
    public static Map<String, String> toInitials(List<String> names){
        Map<String, String> map = new HashMap<>();
        for (String n : names) {
            String[] name = n.split(" ");
            String firstNameLetter = name[0].substring(0,1);
            String lastnameLetter = name[1].substring(0,1);
            String initials = firstNameLetter + "." + lastnameLetter + ".";
            map.put(n, initials);

        }
        return map;
    }

}
