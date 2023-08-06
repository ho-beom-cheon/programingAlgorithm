package Before_2023.August.week2;

/** Solution04 : 평균구하기
 *  문제 유형 : 연산
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-15
 */
public class Solution04 {
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / arr.length;

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] var = {1,2,3,4};

        solution(var);
    }
}
