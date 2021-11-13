package November.week2;

/** Solution03 : Concatenation of Array
 *  문제 유형 : Array
 *  출처 : LeetCode
 *  날짜 : 2021-11-13
 */
public class Solution03 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] val1 = {1,2,1};

        getConcatenation(val1);
    }
}
