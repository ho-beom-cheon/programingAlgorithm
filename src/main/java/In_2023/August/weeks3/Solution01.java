package In_2023.August.weeks3;

/** Solution01 : 마법의 엘리베이터
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-08-20
 */
public class Solution01 {
    public static int solution(int storey) {
        int answer = 0;

        String stVal = String.valueOf(storey);
        char[] chars = stVal.toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - '0';
        }

        for (int i = ints.length - 1; i >= 0; i--) {
            int anInt = ints[i];

            if (anInt == 10) {
                if (i - 1 < 0) {
                    answer += 1;
                    continue;
                }
                ints[i - 1]++;
                continue;
            }

            if (anInt >= 6) {
                answer += (10 - anInt);
                if (i - 1 < 0) {
                    answer += 1;
                    continue;
                }
                ints[i - 1]++;
            } else if (anInt <= 4) {
                answer += anInt;
            } else if (anInt == 5) {
                if (i - 1 < 0) {
                    answer += 5;
                    continue;
                } else {
                    if (ints[i - 1] < 5) {
                        answer += anInt;
                    } else {
                        answer += 5;
                        ints[i - 1]++;
                    }
                }
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(16);
        solution(2554);
    }
}
