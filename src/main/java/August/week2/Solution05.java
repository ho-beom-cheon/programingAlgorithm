package August.week2;

/** Solution05 : x만큼 간격이 있는 n개의 숫자
 *  문제 유형 : 연산
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-15
 */
public class Solution05 {
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i =0; i<n; i++){
            answer[i] = x*(i+1);
        }

        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int var = 2;
        int var2 = 5;

        solution(var,var2);
    }
}
