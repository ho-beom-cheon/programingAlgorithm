package August.week2;

/** Solution03 : 소수만들기
 *  문제 유형 : 함수
 *  출처 : 프로그래머스 - Summer/Winter Coding(~2018)
 *  날짜 : 2021-08-10
 */
public class Solution03 {
    public static int primeNumber(int num){
        boolean flag = true;
        if(num <= 7) return 1;
        for(int i = 3; i < num; i+=2){
            if(num % i == 0){
                flag = false;
            }
        }

        if(flag){
            return 1;
        }
        return 0;
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum % 2 != 0){
                        answer += primeNumber(sum);
                    }
                }
            }
        }
        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] var1 = {1,2,3,4};

        solution(var1);
    }
}
