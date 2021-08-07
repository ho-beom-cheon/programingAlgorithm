package August.week1;

/** Solution03 : 내적
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌1
 *  날짜 : 2021-08-07
 */
public class Solution03 {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {1,2,3,4};
        int[] val2 = {-3,-1,0,2};

        solution(val1, val2);
    }
}
