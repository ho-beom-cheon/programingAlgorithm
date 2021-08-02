package July.week3;

/** Solution03 : 2016년
 *  문제 유형 : 연산
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-07-30
 */
public class Solution03 {
    public static String solution(int a, int b) {
        String answer = "";

        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int want_day = 0;

        for(int i=0; i<year.length; i++) {
            year[i] =  day[(i+5)%7];
        }

        for(int i=0; i<a-1; i++) {
            want_day += month[i];
        }

        want_day += b-1;

        answer = year[want_day];

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 24;
        solution(val1, val2);
    }
}
