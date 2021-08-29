package August.week4;

import java.util.Scanner;

/** Solution01 : 직사각형 별찍기
 *  문제 유형 : 알고리즘
 *  출처 : 프로그래머스 - 연습문제
 *  날짜 : 2021-08-29
 */
public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.println("");
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println(a + b);
    }
}

