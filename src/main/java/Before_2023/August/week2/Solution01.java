package Before_2023.August.week2;

/** Solution01 : 상호평가
 *  문제 유형 : 배열
 *  출처 : 프로그래머스 - 위클리챌린지(2주차)
 *  날짜 : 2021-08-09
 */
public class Solution01 {
    public static String solution(int[][] scores) {
        String answer = "";
        int averageAnswer = 0;
        int maxAnswer = 0;
        int minAnswer = 0;
        int maxConut  = 0;
        int minConut  = 0;

        for(int i=0; i<scores.length; i++) {
            maxAnswer = 0;
            minAnswer = 0;
            maxConut  = 0;
            minConut  = 0;
            averageAnswer = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if(j == 0){
                    maxAnswer = scores[j][i];
                    minAnswer = scores[j][i];
                }
                if(j > 0){
                    if(scores[j][i] != maxAnswer) {
                        maxAnswer = Math.max(scores[j][i], maxAnswer);
                    } else {
                        maxConut++;
                    }
                    if(scores[j][i] != minAnswer) {
                        minAnswer = Math.min(scores[j][i], minAnswer);
                    } else {
                        minConut++;
                    }
                }

                averageAnswer += scores[j][i];

            }
            System.out.print( averageAnswer + " ==>");
            if(scores[i][i] == maxAnswer && maxConut == 0){
                averageAnswer = (averageAnswer - maxAnswer) / (scores[i].length-1);
            } else if(scores[i][i] == minAnswer && minConut == 0){
                averageAnswer = (averageAnswer - minAnswer) / (scores[i].length-1);
            } else {
                averageAnswer = averageAnswer / scores[i].length;
            }
            System.out.println(" " + averageAnswer);

            if(averageAnswer >= 90) {
                answer += "A";
            } else if(averageAnswer >= 80 && averageAnswer < 90){
                answer += "B";
            } else if(averageAnswer >= 70 && averageAnswer < 80){
                answer += "C";
            } else if(averageAnswer >= 50 && averageAnswer < 70){
                answer += "D";
            } else if(averageAnswer < 50){
                answer += "F";
            }
        }

        System.out.println(answer);
        System.out.println("-------------------------");

        return answer;
    }

    public static void main(String[] args) {
        int[][] val = {{100,90,98,88,65}
                      ,{50,45,99,85,77}
                      ,{47,88,95,80,67}
                      ,{61,57,100,80,65}
                      ,{24,90,94,75,65}};
        int[][] val2 = {{70,49,90}
                       ,{68,50,38}
                       ,{73,31,100}};
        int[][] val3 = {{50,90}
                       ,{50,87}};
        solution(val);
        solution(val2);
        solution(val3);
    }
}

