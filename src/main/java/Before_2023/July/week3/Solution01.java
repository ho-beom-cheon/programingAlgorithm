package Before_2023.July.week3;

/** Solution01 : 이상한 문자 만들기
 *  문제 유형 : 함수
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-07-27
 */
public class Solution01 {
    public static String solution(String s) {
        String answer = "";
        String[] ch = s.split("");
        int idx = 0;

        for(int i=0; i<ch.length; i++) {
            if(ch[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                ch[i] = ch[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                ch[i] = ch[i].toLowerCase();
                idx++;
            }
            answer += ch[i];
        }
        System.out.println("답확인 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String str = "try hello world";
        solution(str);
    }
}
