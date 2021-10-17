package October.week2;

/** Solution03 : 스킬트리
 *  문제 유형 : 함수
 *  출처 : 프로그래머스 - Summer/Winter Coding(~2018)
 *  날짜 : 2021-10-17
 */
public class Solution03 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean isSkill;

        for(String s : skill_trees) {
            isSkill = true;
            int skillNum = 0;

            for(int i=0; i<s.length(); i++) {
                if(skill.indexOf(s.charAt(i))>-1) {
                    if(skill.charAt(skillNum) == s.charAt(i)) {
                        skillNum++;
                    }
                    else {
                        isSkill = false;
                        break;
                    }
                }
            }
            if(isSkill) {
                answer++;
            }
        }

        System.out.println("답 : " + answer);

        return answer;
    }

    public static void main(String[] args) {
        String val1 = "CBD";
        String[] val2 = {"BACDE", "CBADF", "AECB", "BDA"};

        solution(val1, val2);
    }
}
