package November.week2;

import java.util.Arrays;

/** Solution01 : Single Number
 *  문제 유형 : Array
 *  출처 : LeetCode
 *  날짜 : 2021-11-13
 */
public class Solution01 {
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-1; i+=2){
            if(nums[i]!=nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];

    }

    public static void main(String[] args) {
        int[] participant1 = {2,2,1};

        singleNumber(participant1);
        System.out.println(singleNumber(participant1));

    }
}

