package October.week4;

import java.util.HashMap;
import java.util.Map;

/** Solution02 : Two Sum
 *  문제 유형 : Arrays
 *  출처 : LEETCODE
 *  날짜 : 2021-10-31
 */
public class Solution02 {

    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] val1 = {2,7,11,15};
        int val2 = 9;
        solution(val1, val2);
    }
}
