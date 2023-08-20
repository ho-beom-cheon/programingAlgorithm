package Before_2023.September.week2;

/** Solution02 : 숫자 문자열과 영단어
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-12
 */
public class Solution02 {
    public static int solution(String s) {

        int answer = 0;
        //영단어
        String[] str = {"zero","one", "two","three","four","five","six","seven","eight","nine"};
        //숫자
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};

        for(int i=0; i<str.length; i++){
            s = s.replace(str[i],num[i]);
        }

        answer = Integer.parseInt(s);

        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String var = "one4seveneight";

        solution(var);
    }
}
