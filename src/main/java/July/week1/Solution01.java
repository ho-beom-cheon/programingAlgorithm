package July.week1;

import java.util.HashMap;
import java.util.Map;

/** Solution01 : 완주하지 못한 선수
 *  문제 유형 : 해시
 */
public class Solution01 {
    public static String solution01(String[] participant, String[] completion) {
        String answer = "";
        int value = 0;

        Map<String, Integer> map = new HashMap<>();

        for(String str : participant){
            if(map.get(str) == null) {
                map.put(str,1);
                System.out.println("null : " + map);
            }
            else {
                value = map.get(str) + 1;
                map.put(str, value);
                System.out.println("str : " + map);
            }
        }

        for(String str2 : completion){
            value = map.get(str2) - 1;
            map.put(str2, value);
        }
        //System.out.println("str2 : " + value);
        for(String key : map.keySet()){
            if(map.get(key) == 1) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1  = {"eden", "kiki"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2  = {"josipa", "filipa", "marina", "nikola"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3  = {"stanko", "ana", "mislav"};

        solution01(participant1, completion1);
        System.out.println(solution01(participant1, completion1));
        solution01(participant2, completion2);
        System.out.println(solution01(participant2, completion2));
        solution01(participant3, completion3);
        System.out.println(solution01(participant3, completion3));
    }
}

