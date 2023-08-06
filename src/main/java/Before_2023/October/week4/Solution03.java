package Before_2023.October.week4;

/** Solution03 : Palindrome Number
 *  문제 유형 : 알고리즘
 *  출처 : LeetCode
 *  날짜 : 2021-10-31
 */
public class Solution03 {

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        for(int i=0; i<str.length()/2; i++){
            if(!(str.charAt(i)==str.charAt(str.length()-1-i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int val1 = 121;

        isPalindrome(val1);
    }
}
