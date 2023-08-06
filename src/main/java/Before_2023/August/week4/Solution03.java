package Before_2023.August.week4;

/** Solution03 : 최대공약수와 최소공배수
 *  문제 유형 : 함수
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-29
 */
public class Solution03 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int maxVal = Math.max(n, m);
        int minVal = Math.min(n, m);

        answer[0] = cal(maxVal, minVal);
        answer[1] = maxVal*minVal/answer[0];

        System.out.println("답 : " + answer[0]);
        System.out.println("답 : " + answer[1]);

        return answer;
    }

    static int cal(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return cal(b, a%b);
    }

    public static void main(String[] args) {
        int var = 3;
        int var2 = 12;

        solution(var, var2);

    }
}

