package Before_2023.April.week3;

/**
 * Solution01 : 신규 아이디 추천
 *  문제 유형 : 정규식
 *  출처 : 프로그래머스 (2021 KAKAO BLIND RECRUITMENT)
 *  날짜 : 2022-04-24
 *  내용 : 정규식 사용 방식에 대한 이해와 단계별 처리에서 발생하는 문제점 파악하고 해결
 */

public class Solution01 {
    public static String solution(String new_id) {
        // step 1 : 모든 대문자를 대응되는 소문자로 치환합니다.
        String answer = new_id.toLowerCase();
        // step 2 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        // step 3 : 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = answer.replaceAll("[.]{2,}", ".");
        // step 4 : 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        answer = answer.replaceAll("^[.]{1}", "");
        // step 5 : 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(answer.equals(""))  answer += "a";
        // step 6 : 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if(answer.length() >= 16) answer = answer.substring(0, 15);
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        answer = answer.replaceAll("[.]{1}$", "");
        // step 7 : 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(answer.length() <= 2) {
            for(int i = answer.length(); i < 3; i++){
                answer += answer.substring(answer.length()-1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // 정답 : "bat.y.abcdefghi"
        String val1 = "...!@BaT#*..y.abcdefghijklm";
        // 정답 : "z--"
        String val2 = "z-+.^.";

        solution(val1);
        solution(val2);

        System.out.println(solution(val1));
        System.out.println(solution(val2));
    }
}
