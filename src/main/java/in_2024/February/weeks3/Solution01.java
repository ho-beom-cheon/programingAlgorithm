package in_2024.February.weeks3;

/** Solution01 : 타켓 넘버
 *  문제 유형 : 깊이/너비 탐색 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2024-02-22
 */
public class Solution01 {
    static int count = 0;

    public static int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return count;
    }
    // 재귀함수
    public static void dfs(int[] number, int depth, int target, int result) {
        if(depth == number.length) {  // 마지막까지 수행 후 종료
            if(target == result){   // 타겟 값과 같은 값이 있으면 카운팅
                count++;
            }
            return ;
        }

        int plus = result + number[depth];
        int minus = result - number[depth];

        dfs(number, depth+1, target, plus);
        dfs(number, depth+1, target, minus);
    }
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 2;
        int answer = solution(numbers, target);
        System.out.println(answer);

    }
}
