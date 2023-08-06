package Before_2023.August.week1;

/** Solution02 : 약수의 개수와 덧셈
 *  문제 유형 : 연산
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌2
 *  날짜 : 2021-08-03
 */
public class Solution02 {
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<right+1; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    cnt ++;
                }
            }
            if(cnt%2 ==0){
                answer = answer + i;
            }else{
                answer = answer -i;
            }
        }
        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int val1 = 24;
        int val2 = 27;

        solution(val1, val2);
    }
}
