package Before_2023.October.week4;

/** Solution01 : 이진 변환 변경하기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 월간 코드 챌린지 시즌1
 *  날짜 : 2021-10-31
 */
public class Solution01 {
    public static int[] solution(String s) {
        int[] answer = new int[2];

        int tryCnt = 0;
        int zeroCnt  = 0;
        while (!s.equals("1")) {
            tryCnt++;
            String temp = s.replaceAll("0", "");
            int zeroTemp = 0;
            zeroTemp = s.length() - temp.length();
            zeroCnt += zeroTemp;

            s = Integer.toBinaryString(temp.length());
        }
        answer[0] = tryCnt;
        answer[1] = zeroCnt;

        System.out.println("answer :" + answer[0]);
        System.out.println("answer :" + answer[1]);

        return answer;


    }
    public static void main(String[] args) {
        String var = "110010101001";

        solution(var);
    }
}

