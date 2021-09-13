package September.week3;

/** Solution01 : 없는 숫자 더하기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌3
 *  날짜 : 2021-09-13
 */
public class Solution01 {
    public static int solution(int[] numbers) {
        int answer = 0;
        String flag = "N";
        int[] baseNum = {0,1,2,3,4,5,6,7,8,9};

        for(int i=0; i<baseNum.length; i++){
            flag = "N";
            for(int j=0; j<numbers.length; j++){
                if(baseNum[i] == numbers[j]){
                    flag = "Y";
                }
            }
            if(flag == "N"){
                answer += baseNum[i];
            }
        }
        System.out.println("답 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] var  = {1,2,3,4,6,7,8,0};
        int[] var2 = {5,8,4,0,6,7,9};

        solution(var2);
    }
}

