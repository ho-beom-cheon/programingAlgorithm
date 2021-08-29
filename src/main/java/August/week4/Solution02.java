package August.week4;

/** Solution02 : 문자열 내 p와 y의 개수
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-29
 */
public class Solution02 {
        static boolean solution(String s) {

            int cnt = 0;
            char ch = ' ';

            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                if(ch == 'p' || ch== 'P')
                    cnt++;
                else if (ch == 'y' || ch == 'Y')
                    cnt--;
            }
            if(cnt != 0) {
                return false;
            }
            return true;
    }


    public static void main(String[] args) {
        String s = "pPoooyY";

        solution(s);

        System.out.println("답 : " + solution(s));
    }
}

