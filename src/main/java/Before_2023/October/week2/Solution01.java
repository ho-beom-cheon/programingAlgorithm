package Before_2023.October.week2;

/** Solution01 : 최댓값과 최솟값
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-17
 */
public class Solution01 {
    public static String solution(String s) {
        String answer;

        String[] arr = s.split(" ");

        int max = 0;
        int min = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                max = Integer.parseInt(arr[i]);
                min = Integer.parseInt(arr[i]);
            }

            max = Math.max(Integer.parseInt(arr[i]), max);
            min = Math.min(Integer.parseInt(arr[i]), min);
        }

        answer = min + " " + max;

        System.out.println("답 : " + answer);

        return answer;
    }
    public static void main(String[] args) {
        String var = "1 2 3 4";

        solution(var);
    }
}

