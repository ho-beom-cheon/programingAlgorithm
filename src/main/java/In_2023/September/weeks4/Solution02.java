package In_2023.September.weeks4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/** Solution02 : 개인정보 수집 유효기간
 *  문제 유형 :알고리즘
 *  출처 : 프로그래머스 2023 KAKAO BLIND RECRUITMENT
 *  날짜 : 2023-09-24
 */
public class Solution02 {
    private static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);
        }

        // 년 월 일 구하기
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);

        // 개인정보 수집일자
        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            int type = Integer.parseInt(map.get(privacies[i].split(" ")[1]))*28;

            int num = (year - Integer.parseInt(date.split("\\.")[0]))*28*12
                    + (month - Integer.parseInt(date.split("\\.")[1]))*28
                    + (day - Integer.parseInt(date.split("\\.")[2]));

            if (num >= type) {
                list.add(i+1);
            }
        }

        return list.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String[] a = {"A 6", "B 12", "C 3"};
        String[] b = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution("2022.05.19",a,b)));
    }
}
