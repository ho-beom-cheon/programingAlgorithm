package August.week3;

import java.util.HashMap;
import java.util.Map;

/** Solution01 : 위장
 *  문제 유형 : 해시
 *  출처 : 프로그래머스 - 해시
 *  날짜 : 2021-08-16
 */
public class Solution01 {
    public static int solution(String[][] clothes) {
        Map<String, Integer> hMap = new HashMap();
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) {

            //getOrDefault
            //찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
            hMap.put(clothes[i][1], hMap.getOrDefault(clothes[i][1], 1) + 1);
        }

        for (int i : hMap.values()) {
            answer *= i;
        }
        answer = answer - 1;
        System.out.println(answer);
        System.out.println("-------------------------");

        return answer;
    }

    public static void main(String[] args) {
        String[][] var= {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

        solution(var);
    }
}

