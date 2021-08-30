package section1.s1_1;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {

        /*
            1. max에 a 값을 넣는다.
            2. b값이 max보다 크면 max에 b값을 넣는다.
            3. c값이 max보다 크면 max에 c값을 넣는다.



         */




        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int b = stdIn.nextInt();
        System.out.println("c의 값 : "); int c = stdIn.nextInt();

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
