package August.week1;

/** Solution04 : 음양더하기
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌2
 *  날짜 : 2021-08-07
 */
public class Solution04 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(!signs[i]) absolutes[i] *= -1;
            answer += absolutes[i];
        }
        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {4,7,12};
        boolean[] val2 = {true,false,true};

        solution(val1, val2);
    }
}
