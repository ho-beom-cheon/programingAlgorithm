package April.week3;

/**
 * Solution02 : 점프와 순간이동
 *  문제 유형 :
 *  출처 : 프로그래머스 (Summer/Winter Coding(~2018))
 *  날짜 : 2022-04-24
 *  내용 : 이진법을 사용해서 문제풀이 (참고), 이진법이 아닌 다른 방식의 문제 풀이 학습
 */

public class Solution02 {
    public static int solution(int n) {
        String binaryCode = Integer.toBinaryString(n);

        String []arr = binaryCode.split("");
        int length = arr.length;
        int ans=0;

        for(int i=0; i<length; i++){
            if (arr[i].equals("1")){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int val1 = 5;


        solution(val1);
        //solution(val2);

        System.out.println(solution(val1));
        //System.out.println(solution(val2));
    }
}
