package section1.s1_2;

import java.util.Scanner;

public class Q10 {
    // a, b를 입력하고 b-a를 출력하는 프로그램 작성.
    // 단 b에 입력한 값이 a이하면 b를 다시 입력하도록.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("a값 입력");
        a = sc.nextInt();

        do{
            System.out.println("b값 입력");
            b = sc.nextInt();
        } while (a >= b);

        System.out.println("b - a는 " + (b-a) + "입니다.");


    }


}
