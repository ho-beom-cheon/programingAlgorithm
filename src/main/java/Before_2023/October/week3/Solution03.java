package Before_2023.October.week3;

import java.util.Arrays;

/** Solution03 : 예산
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - Summer/Winter Coding(~2018)
 *  날짜 : 2021-10-24
 */
public class Solution03 {

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int j : d) {
            if (budget == 0 || budget < j) {
                break;
            }
            budget -= j;
            answer++;
        }

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {1,3,2,5,4};
        int val2 = 9;

        solution(val1, val2);
    }
}
