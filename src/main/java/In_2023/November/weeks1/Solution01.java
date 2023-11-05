package In_2023.November.weeks1;
/** Solution01 : 달리기 경주
 *  문제 유형 : map
 *  출처 : 프로그래머스 연습문제
 *  날짜 : 2023-11-06
 */

import java.util.*;

public class Solution01 {
    public static String[] solution(String[] players, String[] callings) {
        //성공 : 이중 포문은 시간 제한이 걸림. 배열 내에서 위치를 계속해서 저장할 수 있는 MAP을 활용

        Map<String, Integer> rank = new HashMap<>();

        for(int i=0; i<players.length; i++){
            rank.put(players[i],i);
        }

        for (String player : callings){
            int ranking = rank.get(player);

            String beforePlayer = players[ranking-1];

            players[ranking-1] = player;
            players[ranking] = beforePlayer;

            rank.put(player, ranking-1);
            rank.put(beforePlayer, ranking);
        }
        System.out.println("닶 확인 : " + Arrays.toString(players));

        return players;

        // 실패 : 시간초과
//        String temp = "";
//        for (String k : callings) {
//            for (int i = 0; i < players.length; i++){
//                if(k.equals(players[i])) {
//                    temp = players[i-1];
//                    players[i-1] = players[i];
//                    players[i] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(players));
//
//        return players;
        // 실패 : 시간초과
//        List<String> words = Arrays.asList(players);
//        String temp = "";
//
//        for (String k : callings) {
//            for (int i = 0; i < players.length; i++){
//                System.out.println(words.stream().findAny());
//                if(k.equals(players[i])) {
//                    Collections.swap(words, (i-1), i);
//                    break;
//                }
//            }
//        }
//
//        return players;

    }


    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        solution(players, callings);

    }
}
