package Before_2023.August.week3;

import java.util.ArrayList;

/** Solution04 : 모의고사
 *  문제 유형 : 완전탐색
 *  출처 : 프로그래머스 - 완전탐색
 *  날짜 : 2021-08-22
 */
public class Solution04 {
    public static int[] solution(int[] answers) {
        // 수포자들 찍는 패턴
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == person1[i%5])
                score[0]++;
            if(answers[i] == person2[i%8])
                score[1]++;
            if(answers[i] == person3[i%10])
                score[2]++;

        }
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(score[i] > max)
                max = score[i];
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if (score[i] == max) {
                tmp.add(i + 1);
            }
        }
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++)
            answer[i] = tmp.get(i);

        return answer;
    }

    public static void main(String[] args) {
        int[] var= {1,2,3,4,5};

        solution(var);
    }
}

