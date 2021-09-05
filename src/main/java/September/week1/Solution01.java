package September.week1;

/** Solution01 : 콜라츠 추측
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-05
 */
public class Solution01 {
    public static int solution(int num) {
        int answer = 0;

        while (num != 1){
            if(num % 2 == 0) {
                num = num / 2;
            }else if(num % 2 == 1){
                num = num * 3 + 1;
            }
            answer++;

            if(answer == 500) {
                answer = -1;
                System.out.println("답 : " + answer);
                return answer;
            }
        }
        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int var = 626331;

        solution(var);
    }
}

