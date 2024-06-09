package in_2024.June.weeks1;

/** Solution01 : 숫자 변환하기
 *  문제 유형 : dp 알고리즘
 *  출처 : 프로그래머스
 *  날짜 : 2024-06-07
 */

/*
*
    자연수 x를 y로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.

    x에 n을 더합니다
    x에 2를 곱합니다.
    x에 3을 곱합니다.
    자연수 x, y, n이 매개변수로 주어질 때, x를 y로 변환하기 위해 필요한 최소 연산 횟수를 return하도록 solution 함수를 완성해주세요. 이때 x를 y로 만들 수 없다면 -1을 return 해주세요.

* */


public class Solution01 {

    public static int solution(int x, int y, int n) {
        // 시간이 너무 오래 걸려서 성능 테스트 실패
//        int answer = 0;
//        int countPlus = 0;
//        int countTwoMultiply = 0;
//        int countThreeMultiply = 0;
//
//        // x에 n을 더합니다
//        countPlus = (y-x)%n == 0 ? (y-x)/n : -1;
//         //x에 2를 곱합니다.
//        countTwoMultiply =//// y%(x*2) == 0 ? y/(x*2) : -1;
//        // x에 3을 곱합니다.
//        countThreeMultiply = y%(x*3) == 0 ? y/(x*3) : -1;
//
//        // 최소값 비교
//        if(countPlus != -1 && countTwoMultiply != -1){
//            answer = Math.min(countPlus, countTwoMultiply);
//        } else {
//            answer = -1;
//        }
//        if(answer != -1) {
//            if (answer > countThreeMultiply && countThreeMultiply != -1) {
//                answer = countThreeMultiply;
//            }
//        }
//        System.out.println(countPlus);
//        System.out.println(countTwoMultiply);
//        System.out.println(countThreeMultiply);
//        System.out.println(answer);
//
//        return answer;

// dp 방식으로 풀어야 시간 이슈에 걸리지 않음
        int answer = 0;
        int[] dp = new int[y+1];

        for(int i=x;i<=y;i++){
            if(i!=x && dp[i]==0) dp[i]=-1;
            else{
                if(i*3<=y) dp[i*3] = dp[i*3]==0 ? dp[i]+1 : Math.min(dp[i*3], dp[i]+1);

                if(i*2<=y) dp[i*2] = dp[i*2]==0 ? dp[i]+1 : Math.min(dp[i*2], dp[i]+1);

                if(i+n<=y) dp[i+n] = dp[i+n]==0 ? dp[i]+1 : Math.min(dp[i+n], dp[i]+1);
            }

        }

        System.out.println(dp[y]);
        return dp[y];
    }


    public static void main(String[] args) {
        solution(10, 40, 30);
        solution(2, 5, 4);
    }

}
