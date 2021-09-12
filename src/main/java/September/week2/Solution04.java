package September.week2;

/** Solution04 : 자연수 뒤집어 배열로 만들기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-12
 */
public class Solution04 {
    public static int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i=0; i<length; i++) {
            answer[i] = (int)(n%10);
            System.out.println("답 : " + answer[i]);

            n /= 10;
        }



        return answer;
    }

    public static void main(String[] args) {
        int val = 12345;

        solution(val);
    }
}
