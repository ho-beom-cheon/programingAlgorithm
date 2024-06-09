package in_2024.April.weeks3;

/** Solution01 : 덧칠하기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2024-04-21
 */
public class Solution01 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        for (int item : section) {
            if (start + m > item) {
                continue;
            }
            start = item;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2,3,6};

        Solution01 sol = new Solution01();
        System.out.println(sol.solution(n, m, section));
    }
}
