package In_2023.December.weeks2;
/** Solution01 : 바탕화면 정리
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-12-16
 */
public class Solution01 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();
        answer[2] = 0;
        answer[3] = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            String[] str = wallpaper[i].split("");
            for (int j = 0; j < str.length; j++) {
                if ("#".equals(str[j])) {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }
            }
        }

        answer[2] += 1;
        answer[3] += 1;

        return answer;
    }
}
