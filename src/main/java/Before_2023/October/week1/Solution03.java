package Before_2023.October.week1;

/** Solution03 : 8주차_최소직사각형
 *  문제 유형 : 함수
 *  출처 : 프로그래머스 - 위클리 챌린지
 *  날짜 : 2021-10-09
 */
public class Solution03 {
    public static int solution(int[][] sizes) {
        int answer;
        int max_v = 0;
        int max_h = 0;

        for (int[] size : sizes) {
            int v = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            max_v = Math.max(max_v, v);
            max_h = Math.max(max_h, h);
        }

        answer = max_v*max_h;

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] val1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        solution(val1);
    }
}
