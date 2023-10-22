package In_2023.October.weeks3;
/** Solution02 : 귤 고르기
 *  문제 유형 : map
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-10-22
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Solution02 {
    private static Map<Integer, Integer> map;
    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        // 크기별로 몇 개 있는지 map에 저장함
        map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }

        // 개수(value)가 많은 순으로 정렬
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // 개수가 많은 순부터 사용
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (k <= 0) break;
            answer++;
            k -= entry.getValue();
        }

        return answer;
    }
    public static void main(String[] args) {
        int k = 6;
        int[] t = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(solution(k,t));
    }
}

