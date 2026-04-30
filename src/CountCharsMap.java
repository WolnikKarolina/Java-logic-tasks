import java.util.HashMap;
import java.util.Map;

public class CountCharsMap {
    public Map<Character, Integer> countChars(String text){
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
        count.merge(text.charAt(i), 1, Integer::sum);
        }
        return count;
    }
    //rozw2
    // count.put(text.charAt(i), count.getOrDefault(text.charAt(i),0) + 1);
    // rozw1
    //if ( count.containsKey(text.charAt(i))){
    //     int value = count.get(text.charAt(i));
    //     count.replace(text.charAt(i), value + 1);
    // } else {
    //     count.put(text.charAt(i), 1);
    // }


    // porwonaj czy dwa stringi sa anagramami
    public boolean isAnagram(String text1, String text2){
        if ( text1.length() != text2.length()){
            return false;
        }
        Map<Character, Integer> map1 = countChars(text1);
        Map<Character, Integer> map2 = countChars(text2);
        return map1.equals(map2);
    }

    static void main(String[] args) {
        CountCharsMap m = new CountCharsMap();
        System.out.println(m.countChars("aabbyyciiiii"));
        Map<Character, Integer> map = m.countChars("ajjjeeennnnnniejeeee");
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ";" + e.getValue());

        }

        // porwonaj czy dwa stringi sa anagramami
        System.out.println(m.isAnagram("listen", "silent"));
    }
}
