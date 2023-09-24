package In_2023.September.weeks4;

import java.util.Arrays;

/** Solution01 : 테이블 해시 함수
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-09-24
 */
public class Solution01 {
    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        Arrays.sort(data, ((o1, o2) -> o1[col - 1] != o2[col - 1] ? o1[col - 1] - o2[col - 1] : o2[0] - o1[0]));

        for (int i = row_begin - 1; i <= row_end - 1; i++) {
            int j = 0;
            for (int d : data[i]) j += (d % (i + 1));
            answer = (answer ^ j);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] data = {{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}};
        int col = 2;
        int row_begin = 2;
        int row_end = 3;
        solution(data, col, row_begin, row_end);
        System.out.println(solution(data, col, row_begin, row_end));
    }
}
