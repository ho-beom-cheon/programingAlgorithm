package September.week1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/** Solution03 : 최솟값 만들기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-09-05
 */
public class Solution03 {
    public static int solution(int []A, int []B){
        int answer = 0;
        int leng = A.length-1;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++){
            if(leng >= 0) {
                answer += A[i] * B[leng];
                leng--;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {1,4,2};
        int[] val2 = {5,4,4};

        solution(val1, val2);
    }
}
