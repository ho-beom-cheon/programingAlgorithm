package Before_2023.September.week2;

/** Solution03 : 다음 큰 숫자
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-12
 */
public class Solution03 {
    public static int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }

        for(int i = n+1; ; i++){
            String temp = Integer.toBinaryString(i);
            int nextNumCnt = 0;
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == '1') nextNumCnt++;
            }

            if(nextNumCnt == cnt) {
                answer = i;
                break;
            }
        }

        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int val = 78;

        solution(val);
    }
}
