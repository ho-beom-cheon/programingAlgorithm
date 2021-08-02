package July.week2;

/** Solution05 : 핸드폰 번호 가리기
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-07-25
 */
public class Solution05 {
    public static String solution(String phone_number) {
        String answer = "";
        String[] number = phone_number.split("");
        for(int i=0; i<number.length; i++){
            if(i < (number.length-4)){
                answer += "*";
            } else {
                answer += number[i];
            }
        }
        System.out.println("answer : "+answer);
        return answer;

    }

    public static void main(String[] args) {
        String val = "01033334444";
        String val2 = "027778888";

        solution(val);
        solution(val2);
    }
}
