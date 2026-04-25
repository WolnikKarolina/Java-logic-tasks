import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       
        StringBuilder pref = new StringBuilder();
        int pos = 0;

        // prefix nie ma prawa być dłuższy niż najkrótszy wyraz z tablicy
        int minLenght = Integer.MAX_VALUE;
        for (String s : strs) {
            minLenght = Math.min(minLenght, s.length());
        }
        // czyli maxymalnei sprawdzamy tyle razy ile wynosi dlugosc nakrotszego wyrazu z tablicy
        // bierzemy kazda litere po kolei i sprawdzamy czy sa takie same
        while (pos < minLenght){
            char current = strs[0].charAt(pos);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(pos) != current){
                    return pref.toString();
                }
            }
            pref.append(current);
            pos++;
        }
        return pref.toString();
    }
}
