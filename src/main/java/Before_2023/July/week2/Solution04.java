package Before_2023.July.week2;

/** Solution04 : 3진법 뒤집기
 *  문제 유형 : 배열, 알고리즘
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌1
 */
public class Solution04 {
    public static int solution(int n) {
        int answer = 0;
        String str = "";

        while (n > 0){
            str = (n % 3) + str;
            n = n / 3;
        }
        String[] array = str.split("");

        for(int i=array.length-1; i>=0; i--){
            if(i==0)
                answer += (Integer.parseInt(array[i]));
            else {
                answer += (Integer.parseInt(array[i]) * (Math.pow(3, i)));
                System.out.println("i : " + i);
                System.out.println(Integer.parseInt(array[i]) + "*" + Math.pow(3, i) + "=" + answer);
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int val = 125;
        solution(val);
    }
}
