package July.week1;

import java.util.Arrays;

/** Solution02 : k번째 수
 *  문제 유형 : 정렬
 */
public class Solution02 {
    public static int[] Solution02(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;

        for(int i = 0; i < commands.length; i++) {
            int a = 0;
            int[] arr = new int[(commands[i][1] - commands[i][0]) + 1];
            for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
                arr[a] = array[j];
                a++;
            }
            Arrays.sort(arr);
            answer[n] = arr[commands[i][2]-1];
            System.out.println("answer11 : " + answer[n]);
            n++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution02(array, commands);
    }
}