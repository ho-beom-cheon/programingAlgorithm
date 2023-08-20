package Before_2023.September.week3;

/** Solution03 : 올바른괄호
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-15
 */
public class Solution03 {
    static boolean solution(String s) {
        boolean answer;
        int cnt = 0;

        if(s.charAt(0) == ')'){
            return false;
        }

        for(int i=0; i< s.length(); i++) {
            if(s.charAt(i) == '('){
                cnt++;
            }else {
                if(cnt <= 0) {
                    return false;
                }
                cnt--;
            }
        }
        answer = cnt == 0;

        return answer;
    }

    public static void main(String[] args) {
        String val = "(()(";
        String val2 = "(()()))((()))";

        solution(val);
        solution(val2);

        System.out.println("답 : " + solution(val));
        System.out.println("답 : " + solution(val2));
    }
}
