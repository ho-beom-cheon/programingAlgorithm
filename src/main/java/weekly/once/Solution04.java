package weekly.once;

import java.util.ArrayList;
import java.util.List;

/** Solution04 : 폰켓몬
 *  문제 유형 : 배열,리스트
 *  출처 : 프로그래머스 코딩테스트연습(찾아라 프로그래밍 마에스터)
 */
public class Solution04 {
    public static int solution04(int[] nums) {
        int answer = 0;
        //뽑아서 저장할 수
        int numsLength = nums.length / 2;
        //종류를 저장할 리스트
        List<Integer> kindList = new ArrayList<Integer>();
        //비교할 첫번째 값 저장
        kindList.add(nums[0]);

        //중복 종류 제거
        for (int i = 1; i < nums.length; i++) {
            if (!kindList.contains(nums[i])) {
                kindList.add(nums[i]);
            }
        }

        if (kindList.size() < numsLength) {
            answer = kindList.size();
        } else {
            answer = numsLength;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        solution04(nums);
        solution04(nums2);
        solution04(nums3);

        System.out.println(solution04(nums));
        System.out.println(solution04(nums2));
        System.out.println(solution04(nums3));
    }
}
