package Before_2023.July.week3;

/** Solution02 : 하샤드수
 *  문제 유형 : 연산
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-07-30
 */
public class Solution02 {
    public static boolean solution(int x) {
        boolean answer = false;

        int inputNum = x;
        int sum = 0;

        while(inputNum/10 != 0) {
            sum += inputNum % 10;
            inputNum /= 10;
        }
        sum += inputNum;

        if(x % sum == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        int val = 10;
        solution(val);
    }
}
