package Before_2023.August.week3;

import java.util.*;

/** Solution03 : H-Index
 *  문제 유형 : 정렬
 *  출처 : 프로그래머스 - 정렬
 *  날짜 : 2021-08-21
 */
public class Solution03 {
    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int h;
        for(int i=0; i<citations.length; i++){

            h = citations.length-i;

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        System.out.println("답 : " + answer);

        // 답 : 3
        return answer;
    }

    public static void main(String[] args) {
        int[] var= {3, 0, 6, 1, 5};

        solution(var);
    }
}

