package Before_2023.September.week5;

import java.util.Arrays;

/** Solution02 : 땅따먹기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-03
 */
public class Solution02 {
    public static int solution(int[][] land) {

        int answer;

        for(int i=1; i<land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][1], Math.max(land[i-1][0], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        for (int[] ints : land) {
            Arrays.sort(ints);
        }
        answer = land[land.length-1][3];

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] var ={{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        solution(var);
    }
}
