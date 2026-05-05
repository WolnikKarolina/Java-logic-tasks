import java.util.*;

public class GroupAnagramsMap {
    public static Map<String, List<String>> groupAnagrams(List<String> words){
            Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {

            char[] wordByChar = word.toLowerCase().toCharArray();
            Arrays.sort(wordByChar);
            String newWord = new String(wordByChar);
            List<String> anagramWords = map.getOrDefault(newWord, new ArrayList<>());
            anagramWords.add(word);
            map.put(newWord, anagramWords);
        }
        return map;
    }
}
