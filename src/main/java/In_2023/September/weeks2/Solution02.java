package In_2023.September.weeks2;

import java.util.ArrayList;
import java.util.Arrays;

/** Solution02 : 줄 서는 방법
 *  문제 유형 : 순열
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-09-10
 *  참고 : https://blog.naver.com/PostView.naver?blogId=tlstjd436&logNo=222047159567&parentCategoryNo=&categoryNo=43&viewDate=&isShowPopularPosts=false&from=postView#
 */
public class Solution02 {
    public static int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            fac *= i;
        }
        int idx = 0;
        k--;
        while (true) {
            fac /= (n - idx);
            long value = k / fac;
            answer[idx] = list.get((int) value);
            list.remove((int) (value));
            idx++;
            if (idx == n - 1)
                break;
            k %= fac;
        }
        answer[idx] = list.get(0);
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        long k = 15;
        int[] a = solution(n, k);
        System.out.println(Arrays.toString(a));
    }
}
