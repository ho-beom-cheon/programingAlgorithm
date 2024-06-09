    package in_2024.April.weeks2;

    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;

    /** Solution01 : 가장 가까운 같은 글자
     *  문제 유형 : Map
     *  출처 : 프로그래머스 연습문제
     *  날짜 : 2024-04-12
     */

    public class Solution01 {

        public static int[] solution(String s) {
            int[] answer = new int[s.length()];

            Map<Character, Integer> map = new HashMap<>();

//            for (int i = 0; i < s.length(); i++) {
//                if (!map.containsKey(s.charAt(i))) {
//                    answer[i] = -1;
//                    map.put(s.charAt(i), i);
//                } else {
//                    answer[i] = i - map.get(s.charAt(i))th
//                    map.put(s.charAt(i), i);
//                }
//            }
            // getOrDefault :  찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
            for(int i=0; i<s.length();i++){
                char ch = s.charAt(i);
                answer[i] = i-map.getOrDefault(ch,i+1);
                map.put(ch,i);
            }
            System.out.println(Arrays.toString(answer));
            return answer;
        }
        public static void main(String[] args) {
            String str = "foobar";
            solution(str);
        }
    }
