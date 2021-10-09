package October.week1;

/** Solution02 : n개의 최소공배수
 *  문제 유형 : 함수
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-09
 */
public class Solution02 {

    public static int gcd(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);

        while(x % y != 0){
            int r = x % y;
            x = y;
            y = r;
        }

        return y;
    }

    public static int solution(int[] arr) {
        int answer = arr[0];

        for(int i = 1;i<arr.length;i++){
            int gcd = gcd(answer,arr[i]);
            answer = answer * arr[i] / gcd;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {2,6,8,14};

        solution(val1);
    }
}
