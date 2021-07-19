package weekly.week1;

import java.util.Arrays;
import java.util.Comparator;

/** Solution03 : 가장 큰 수
 *  문제 유형 : 정렬
 *  출처 : 프로그래머스
 */
public class Solution03 {
    public static String solution03(int[] numbers) {

        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {

            public int compare(String o1, String o2) {

                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if(result[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (String a : result) {
            answer += a;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        solution03(numbers);
        System.out.println(solution03(numbers));
        solution03(numbers2);
        System.out.println(solution03(numbers2));
    }
}
