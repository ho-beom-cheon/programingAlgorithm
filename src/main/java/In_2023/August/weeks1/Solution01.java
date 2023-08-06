package In_2023.August.weeks1;

/** Solution01 : 보행자 천국
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 2017 카카오코드 예선
 *  날짜 : 2023-08-06
 */
public class Solution01 {
    private static int MOD = 20170805;
    private static int[][] map;
    private static int[][] tmpCityMap;
    public static int solution(int m, int n, int[][] cityMap) {
        map = new int[m + 1][n + 1];
        tmpCityMap = cityMap;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1)
                    map[i][j] = 1;
                else {
                       if (tmpCityMap[i - 1][j - 1] == 0)
                            map[i][j] = (getTopValue(i, j) + getLeftValue(i, j)) % MOD;
                       else
                            map[i][j] = 0;
                }
            }
        }
        System.out.println(map[m][n]);
        return map[m][n];
    }
    public static int getTopValue(int rowIndex, int columnIndex) {
        for (int i = rowIndex - 1; i > 0; i--) {
            if (tmpCityMap[i - 1][columnIndex - 1] != 2)
                return map[i][columnIndex];
        }
        return 0;
    }

    public static int getLeftValue(int rowIndex, int columnIndex) {
        for (int i = columnIndex - 1; i > 0; i--) {
            if (tmpCityMap[rowIndex - 1][i - 1] != 2)
                return map[rowIndex][i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] cityMap = {{0,0,0},{0,0,0},{0,0,0}};
        solution(m,n,cityMap);
    }
}
