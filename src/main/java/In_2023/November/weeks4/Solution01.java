package In_2023.November.weeks4;
/** Solution01 : [PCCP 기출문제] 1번 / 붕대 감기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-11-28
 */
public class Solution01 {
    /*
        bandage : [기술 시전시간, 1초당 회복량, 추가 회복량]
        health :  최대 체력
        attacks : 몬스터의 [[공격 시간],[피해량]]
     */
    public static int solution(int[] bandage, int health, int[][] attacks) {
        // 공격을 받는 시간에는 회복 불가
        int hp = health;
        int t = 1; //시간
        int i = 0; //공격변수
        int continueSuc = 0; //연속성공

        // 시간 진행
        while(true) {
            // 연속 치료 성공시 hp 추가 회복 후 초기화
            if(continueSuc == bandage[0]){
                hp += bandage[2];
                if(hp > health){
                    hp = health;
                }
                continueSuc  = 0;
            }
            // [공격 체크]
            // 공격시간체크
            if(t == attacks[i][0]) {
                hp -= attacks[i][1];
                if(hp <= 0){
                    return -1;
                }
                // 공격 받은 뒤에는 연속 성공 시간 = 0
                continueSuc = 0;
                i++;
            } else if (hp < health) { // 회복 체크
                hp += bandage[1];
                continueSuc++;
            } else {
                continueSuc++;
            }
            // 시간 증가
            t++;

            /* [결과값]
               모든 공격이 종료 시 남은 체력 반환
             */
            if(attacks.length-1 == i){
                return hp;
            }

        }

    }
/* 코드 통과 소스 */
//    static Map<Integer, Integer> attackInfo = new HashMap<>();
//    static int endTime = 0;
//    static int curHealth = 0;
//    static int successiveTime = 0;
//
//    public int solution(int[] bandage, int health, int[][] attacks) {
//        curHealth = health;
//        for (int[] attack : attacks) {
//            attackInfo.put(attack[0], attack[1]);
//            endTime = attack[0];
//        }
//
//        /* 1초부터 마지막 공격 시각까지 체력 정보 초기화 */
//        for (int i = 1; i <= endTime; i++) {
//            if (attackInfo.containsKey(i)) { // 공격이 있다면
//                curHealth -= attackInfo.get(i);
//                successiveTime = 0;
//            } else { // 공격이 없다면
//                curHealth += bandage[1];
//                successiveTime++;
//
//                if (successiveTime == bandage[0]) {
//                    curHealth += bandage[2];
//                    successiveTime = 0;
//                }
//                if (curHealth > health) {
//                    curHealth = health;
//                }
//            }
//
//            if (curHealth <= 0) { // 이번 턴을 마치고 체력이 바닥났다면 종료
//                return -1;
//            }
//        }
//
//        return curHealth;
//    }

    public static void main(String[] args) {
//        int[] bandage = {5,1,5};
        int[] bandage = {2,1,3};
//        int health = 30;
        int health = 50;
//        int[][] attacks = {{2,10},{9,15},{10,5},{11,5}};
        int[][] attacks = {{1,11},{3,2}};

        int result = solution(bandage, health, attacks);

        System.out.println("hp : " +  result);
    }
}
