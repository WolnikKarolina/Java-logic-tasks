// Mając tablicę liczb całkowitych nums i target, zwróć indeksy tych dwóch liczb,
// tak aby ich suma wynosiła target. Możesz założyć, że każde wejście będzie miało dokładnie jedno rozwiązanie
// i nie możesz użyć tego samego elementu dwukrotnie. Możesz zwrócić odpowiedź w dowolnej kolejności.

//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] find = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == x){
                    find[0] = i;
                    find[1] = j;
                }
            }
        }
        return find;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] find = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                find[0] = map.get(x);
                find[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return find;
    }
}
