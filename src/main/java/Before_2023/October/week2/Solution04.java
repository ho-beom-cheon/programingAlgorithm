package Before_2023.October.week2;

/** Solution04 : 1주차_부족한 금액 계산하기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 위클리챌린지
 *  날짜 : 2021-10-17
 */
public class Solution04 {
    public static long solution(int price, int money, int count) {
         //통과안됨
//        long answer = -1;
//        int sum = 0;
//
//        for(int i = 1; i <= count; i++){
//            sum += price * i;
//        }
//        answer = Math.abs(money - sum);
//        if(answer == 0){
//            return 0;
//        }
//        else {
//            return answer;
//        }


        // 등차수열의 합 활용
        long totalPrice = ((long) price * (long) count) * (long) (count + 1) / 2;

        return money >= totalPrice ? 0 : totalPrice - money;
    }

    public static void main(String[] args) {
        int val1 = 3;
        int val2 = 20;
        int val3 = 4;

        solution(val1, val2, val3);
    }
}
