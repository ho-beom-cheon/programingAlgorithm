package November.week2;

/** Solution02 : Longest Common Prefix
 *  문제 유형 : 알고리즘
 *  출처 : LeetCode
 *  날짜 : 2021-11-07
 */
public class Solution02 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.length() <= i || c != str.charAt(i)) {
                    return sb.toString();
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] val1 = {"flower","flow","flight"};

        longestCommonPrefix(val1);

        System.out.println("답 : " + longestCommonPrefix(val1));
    }
}
