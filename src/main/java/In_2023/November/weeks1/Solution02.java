package In_2023.November.weeks1;
/** Solution02 : 추억 점수
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-11-06
 */

import java.util.Arrays;
public class Solution02 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++) {
            for(int j=0; j<photo[i].length; j++) {
                for(int k=0; k<name.length; k++) {
                    if(photo[i][j].equals(name[k]))
                        answer[i] += yearning[k];
                }
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        String[] n = {"may", "kein", "kain", "radi"};
        int[] y = {5, 10, 1, 3};
        String[][] p = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        solution(n,y,p);
    }
}

