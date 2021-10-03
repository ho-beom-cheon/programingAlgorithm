package September.week4;

import java.util.Stack;

/** Solution03 : 짝지어 제거하기
 *  문제 유형 : 스택
 *  출처 : 프로그래머스 - 2017 팁스타운
 *  날짜 : 2021-10-03
 */
public class Solution03 {
    public static int solution(String s) {

        int answer;
        // 스택 선언
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                //스택이 비어있을경우 값을 채운다.
                stack.push(String.valueOf(s.charAt(i)));
            }else{

                String lastVal = stack.peek();
                String currVal = String.valueOf(s.charAt(i));

                // 마지막에 넣은 값과 넣을 값이 같은지 확인
                if(!lastVal.equals(currVal)){
                    stack.push(currVal);
                }else{
                    // 같은면 제거
                    stack.pop();
                }
            }
        }

        answer = stack.size() == 0 ? 1 : 0;

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        String val = "baabaa";

        System.out.println("답 : " + solution(val));

        solution(val);
    }
}
