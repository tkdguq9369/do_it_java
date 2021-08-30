package section1.s1_2;

import java.util.Scanner;

public class Q8 {

    // 1~10 의 합은  (1+10)*5 와 같은 방법으로 구할 수 있다.
    // 가우스 덧셈을 이용하여 1~n까지의 정수 합을 구하는 프로그램을 작성하라.
    // (1 + n) * (n / 2) = 가우스법칙
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n을 입력하세요 : ");
        int n = sc.nextInt();

        int sum;

        sum = (1+n) * (n / 2);

        // 홀수인경우
        if(n % 2 != 0) {
            sum += (1 + n) / 2;
        }

        System.out.println(sum);


    }
}
