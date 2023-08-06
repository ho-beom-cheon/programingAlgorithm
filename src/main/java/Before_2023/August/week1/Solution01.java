package Before_2023.August.week1;

/** Solution01 : 부족한 금액 계산하기
 *  문제 유형 :
 *  출처 : 프로그래머스 - 위클리챌린지(1주차)
 *  날짜 : 2021-08-02
 */
public class Solution01 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        int sum = 0;

        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        answer = Math.abs(money - sum);
        System.out.println("답 : " + answer);
        if(answer == 0){
            return 0;
        }
        else {
            return answer;
        }
    }

    public static void main(String[] args) {
        int price = 5;
        int money = 11;
        int count = 4;

        solution(price, money, count);
    }
}

