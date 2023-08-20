package Before_2023.September.week3;

import java.util.HashMap;

/** Solution02 : 전화번호 목록
 *  문제 유형 : hash
 *  출처 : 프로그래머스 - 해시
 *  날짜 : 2021-09-13
 */
public class Solution02 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> hm = new HashMap<>();

        for( String input : phone_book ) {
            hm.put(input, input);
        }

        for ( String target : phone_book) {

            for( int i=0; i< target.length(); i++) {
                // containskey(key) : 맵에서 인자로 보낸 키가 있으면 true 없으면 false
                // containsValue(value) : 맵에서 인자로 보낸 값이 있으면 true 없으면 false
                if( hm.containsKey(target.substring(0,i)) ) {
                    return false;
                }
                else if ( hm.get(target.substring(0,i)) != null) {
                    return false;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] var = {"119", "97674223", "1195524421"};

        solution(var);
    }
}
