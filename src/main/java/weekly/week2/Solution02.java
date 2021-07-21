package weekly.week2;

/** Solution02 : 전화번호 목록
 *  문제 유형 : 해시
 *  출처 : 프로그래머스
 *  작성일 : 2021-07-21
 */
public class Solution02 {

    public static boolean solution02(String[] phone_book){
        boolean answer = true;

        for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[i].startsWith(phone_book[j])){
                    answer = false;
                    return answer;
                }
                if(phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                    return answer;
                }
            }
        }
        answer =  true;
        return answer;
    }

    public static void main(String[] args) {
        String[] a_phone = {"119", "97674223", "1195524421"};
        String[] b_phone = {"123","456","789"};
        String[] c_phone = {"12","123","1235","567","88"};

        solution02(a_phone);
        solution02(b_phone);
        solution02(c_phone);

        System.out.println(solution02(a_phone));
        System.out.println(solution02(b_phone));
        System.out.println(solution02(c_phone));

    }
}
