package in_2024.April.weeks3;

import java.util.Arrays;

/** Solution02 : 카펫
 *  문제 유형 : 완전탐색 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2024-04-21
 */
public class Solution02 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpet = brown + yellow;

        for (int i = 3; i <= carpet; i++) {
            int col = i; // 세로
            int row = carpet / col; // 가로

            if (row < 3) {
                continue;
            }

            if (row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
    // 좋아요가 가장 많은 다른 사람 풀이
    public int[] solution2(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;

        Solution02 sol = new Solution02();
        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
        System.out.println(Arrays.toString(sol.solution2(brown, yellow)));
    }
}
