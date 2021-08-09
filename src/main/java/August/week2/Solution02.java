package August.week2;

/** Solution02 : 시저암호
 *  문제 유형 : 연산(아스키코드)
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-09
 */
public class Solution02 {
    public static String solution(String s, int n) {
        String answer = "";
        char[] str = new char[s.length()];

        for(int i=0; i<str.length; i++) {
            str[i] = s.charAt(i);
        }

        for(int i=0; i<str.length; i++) {
            if(str[i]==' ') {
                continue;
            } else if(str[i]>='a' && str[i]<='z') {
                if(str[i]+n > 'z') {
                    str[i] = (char)(str[i]+n-26);
                } else {
                    str[i] += n;
                }
            } else if(str[i]>='A' && str[i]<='Z') {
                if(str[i]+n > 'Z') {
                    str[i] = (char)(str[i]+n-26);
                } else {
                    str[i] += n;
                }
            }
        }

        for(int i=0; i<str.length; i++) {
            answer += str[i];
        }

        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String var1 = "AB";
        int var2 = 1;

        solution(var1,var2);
    }
}
