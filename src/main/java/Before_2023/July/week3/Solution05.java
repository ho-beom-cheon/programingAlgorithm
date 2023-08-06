package Before_2023.July.week3;

/** Solution05 : 소수찾기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-01
 */
public class Solution05 {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++){
            boolean chk = true;
            for(int j = 2; j*j <= i; j++){
                if(i % j == 0){
                    chk = false; break;
                }
            }
            if(chk){
                answer++;
            }
        }
        System.out.println("답 : " + answer);
        return answer;
    }
    public static void main(String[] args) {
        int n = 5;
        solution(n);
    }
}
