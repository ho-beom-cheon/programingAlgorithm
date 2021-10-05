package September.week5;

/** Solution01 : 행렬의 곱셈
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-03
 */
public class Solution01 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0;i<answer.length;i++){
            for(int j = 0;j<answer[i].length;j++){
                for(int k =0;k<arr1[i].length;k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];

                    System.out.println("답 : " + answer[i][j]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] var  = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] var2  = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        solution(var, var2);
    }
}

