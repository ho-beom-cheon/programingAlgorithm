package Before_2023.August.week1;

/** Solution05 : 제일 작은 수 제거하기
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-08
 */
public class Solution05 {
    public static int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        int minVal = 0;  //가장 작은 수


        for(int i=0; i<arr.length; i++){
           // 가장 작은 수 도출
            if(i == 0) {
                minVal = arr[i];
            }
            if(i > 0) {
                minVal = Math.min(minVal, arr[i]);
            }
        }


        for(int j=0; j<arr.length; j++){
            if(minVal != arr[j]) {
                answer[j] = arr[j];
                System.out.println("답 : " + answer[j]);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] val1 = {4,3,2,1};

        solution(val1);
    }
}
