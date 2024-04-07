package November.weeks4;

import java.util.Arrays;

public class SolutionTest01 {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        // 공격을 받는 시간에는 회복 불가
        // 체력이 0 이하로 내려가면 회복 불가
        // 공격 받은 뒤에는 연속 성공 시간 = 0


        int answer = 0;
        int hp = health;
        int t = 0;
        hp += bandage[2];
        System.out.println("attacks : " + attacks[0][0]);
        System.out.println("hp : " + hp);

        return answer;
    }


    public static void main(String[] args) {
        int[] bandage = {5,1,5};
        int health = 30;
        int[][] attacks = {{2,10},{9,15},{10,5},{11,5}};

        solution(bandage, health, attacks);
    }

}
