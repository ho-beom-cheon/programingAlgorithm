package Before_2023.November.week2;

import java.util.HashMap;
import java.util.Map;

/** Solution02 : Isomorphic Strings
 *  문제 유형 : Map
 *  출처 : LeetCode
 *  날짜 : 2021-11-13
 */
public class Solution02 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s_chars = s.charAt(i);
            char t_chars = t.charAt(i);

            if(!map.containsKey(s_chars)){
                if(map.containsValue(t_chars)){
                    return false;
                }
                map.put(s_chars,t_chars);
            }
            else if(map.get(s_chars) != t_chars){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        isIsomorphic(s,t);
        System.out.println(isIsomorphic(s,t));

    }
}

