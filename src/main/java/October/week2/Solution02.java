package October.week2;

/** Solution02 : 5주차_모음사전
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-17
 */
public class Solution02 {

    public static int solution(String word) {
        int answer = 0;
        int mul = 781;

        char[] chr = {'A', 'E', 'I', 'O', 'U'};

        for(int i=0; i<word.length(); i++){
            for(int j=0; j<5; j++){
                if(chr[j] == word.charAt(i)){
                    answer += 1 + j * mul;
                }
            }
            mul = (mul-1)/5;
        }

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        String val1 = "AAAAE";

        solution(val1);
    }
}
