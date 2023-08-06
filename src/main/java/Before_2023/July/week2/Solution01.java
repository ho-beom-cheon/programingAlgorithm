package Before_2023.July.week2;

/** Solution01 : 124나라의 숫자
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 연습문제
 */
public class Solution01 {
    public static String solution01(int n) {
        String answer = "";
        String[] numbers = {"4", "1", "2"};

        int num = n;

        while (num > 0) {
            int result = num % 3;
            num /= 3;

            if (result == 0) {
                num--;
            }

            answer = numbers[result] + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        String answer1 = solution01(1);
        String answer2 = solution01(2);
        String answer3 = solution01(3);
        String answer4 = solution01(4);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }
}
