package September.week3;

/** Solution04 : JadenCase 문자열 만들기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-19
 */
public class Solution04 {
    public static String solution(String s) {
        String answer;
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' ') sb.append(" ");
            else if(s.charAt(i - 1) == ' ')
                sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(s.charAt(i));
        }
        answer = sb.toString();

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        String val = "3people unFollowed me";

        solution(val);
    }
}
