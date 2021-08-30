package section1.s1_2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 정수 입력
        int i = sc.nextInt();
        int n = 0;

        do{
            i /= 10;
            n++;
        }while (i > 0);


        System.out.println("그 수는 " + n + "자리입니다.");

    }
}
