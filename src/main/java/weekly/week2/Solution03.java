package weekly.week2;

/** Solution03 : 행렬의 덧셈
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 연습문제
 */
public class Solution03 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        solution(arr1,arr2);
        System.out.println(solution(arr1,arr2));
    }
}
