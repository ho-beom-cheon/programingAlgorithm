package In_2023.September.weeks5;

import java.util.LinkedList;
import java.util.Queue;

/** Solution01 :
 *  문제 유형 :너비 탐색 알고리즘
 *  출처 : 프로그래머스 > 2017 카카오코드 예선 > 카카오프렌즈 컬러링북
 *  날짜 : 2023-10-02
 *  참고 : https://blog.itcode.dev/posts/2021/12/26/programmers-a0067#%ED%92%80%EC%9D%B4
 */
public class Solution01 {
    private static final int[] DX = { 0, 0, -1, 1 };
    private static final int[] DY = { -1, 1, 0, 0 };

    private static boolean[][] isVisit;

    public static int[] solution(int m, int n, int[][] picture) {
        int[] answer = { 0, 0 };

        // picture를 직접 수정하면 문제에서 오류를 일으킴
        int[][] copy = picture.clone();

        isVisit = new boolean[m][n];

        for (int i = 0; i < copy.length; i++)
        {
            for (int j = 0; j < copy[i].length; j++)
            {
                // 원화가 유효한 색을 가지고, 아직 방문하지 않았을 경우
                if (copy[i][j] > 0 && !isVisit[i][j])
                {
                    answer[0]++;
                    answer[1] = Math.max(answer[1], bfs(m, n, i, j, copy));
                }
            }
        }

        return answer;
    }
    private int bfs(int m, int n, int x, int y, int[][] picture)
    {
        int size = 1;

        isVisit[x][y] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y });

        while (!queue.isEmpty())
        {
            int[] position = queue.poll();

            for (int i = 0; i < 4; i++)
            {
                int dx = position[0] + DX[i];
                int dy = position[1] + DY[i];

                // dx와 dy가 전체 영역과 기준 인덱스 사이에 있으면서, 동일한 색을 가지고, 아직 체크하지 않았을 경우
                if (dx > -1 && dx < m && dy > -1 && dy < n && picture[dx][dy] == picture[x][y] && !isVisit[dx][dy])
                {
                    queue.offer(new int[] { dx, dy });

                    isVisit[dx][dy] = true;

                    size++;
                }
            }
        }

        return size;
    }
}
