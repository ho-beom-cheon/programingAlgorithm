package Before_2023.September.week1;

/** Solution02 : 짝수와 홀수
 *  문제 유형 : 연산
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-05
 */
public class Solution02 {
    public static String solution(int num) {
        String answer = "";

        num = Math.abs(num);

        //홀수
        if(num % 2 == 1){
            answer = "Odd";
        }
        //짝수
        else if(num % 2 == 0){
            answer = "Even";
        }

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int val1 = -1;

        solution(val1);
    }
}
