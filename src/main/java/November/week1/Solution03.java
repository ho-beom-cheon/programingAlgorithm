package November.week1;

/** Solution03 : Search Insert Position
 *  문제 유형 : 알고리즘
 *  출처 : LeetCode
 *  날짜 : 2021-11-07
 */
public class Solution03 {
    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int answer = 0;
        int r = nums.length - 1;
        while (answer < r) {
            int m = answer + (r - answer) / 2;
            if (target > nums[m]) {
                answer = m + 1;
            } else {
                r = m;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {1,3,5,6};
        int val2 = 5;

        searchInsert(val1, val2);
    }
}
