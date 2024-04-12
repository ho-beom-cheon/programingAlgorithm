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

            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    answer[i] = -1;
                    map.put(s.charAt(i), i);
                } else {
                    answer[i] = i - map.get(s.charAt(i));
                    map.put(s.charAt(i), i);
                }
            }
            System.out.println(Arrays.toString(answer));
            return answer;
        }
        public static void main(String[] args) {
            String str = "foobar";
            solution(str);
        }
    }
