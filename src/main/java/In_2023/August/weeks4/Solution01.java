package In_2023.August.weeks4;

import java.util.ArrayList;
import java.util.List;

/** Solution01 : 하노이의 탑
 *  문제 유형 : 재귀함수
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-08-27
 */
public class Solution01 {
    private static List<int[]> ansList;

    public static int[][] solution(int n) {

        ansList = new ArrayList<>();
        dfs(n, 1,3, 2);


        int[][] answer = new int[ansList.size()][];
        for(int i=0; i<ansList.size(); i++){
            answer[i] = ansList.get(i);
        }
        return answer;
    }
    //재귀함수
    private static void dfs(int n, int start, int to, int mid) {
        if(n == 1){
            ansList.add(new int[]{start, to});
            return;
        }
        // 1번 기둥의 n-1개를 3번을 걸쳐 2번으로 이동시킴
        dfs(n-1, start, mid, to);

        // 가장 큰 n을 1에서 3으로 이동시킴
        ansList.add(new int[]{start, to});

        // 2번의 기둥의 n-1개를 1번을 걸쳐 3번으로 이동시킴
        dfs(n-1, mid, to, start);
    }

    public static void main(String[] args) {
        solution(2);
    }

}
