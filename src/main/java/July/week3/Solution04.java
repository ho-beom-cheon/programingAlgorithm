package July.week3;

import java.util.Arrays;

/** Solution04 : 체육복
 *  문제 유형 : Greedy
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-01
 */
public class Solution04 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        //정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] val1 = {2, 4};
        int[] val2 = {1,3,5};
        solution(n, val1, val2);
    }
}
