package Before_2023.October.week1;

import java.util.ArrayList;
import java.util.Collections;

/** Solution01 : 문자열 내 마음대로 정렬하기
 *  문제 유형 : ArrayList
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-10-05
 */
public class Solution01 {
    public static String[] solution(String[] strings, int n) {
        String[] answer;
        ArrayList<String> strList = new ArrayList<>();

        for (String string : strings) {
            strList.add(string.charAt(n) + string);
        }

        Collections.sort(strList); //정렬

        answer = new String[strList.size()];

        for(int j=0; j < answer.length; j++){
            answer[j] = strList.get(j).substring(1);

            System.out.println(answer[j]);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] var = {"sun", "bed", "car"};
        int num      = 2;

        solution(var, num);
    }
}

