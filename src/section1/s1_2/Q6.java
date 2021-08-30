package section1.s1_2;

import java.util.Scanner;

public class Q6 {
    // Q6 while문이 종료될 때 변수 i 값이 n+1이 됨을 확인하라.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        int n = sc.nextInt();
        int sum = 0;


        while(i <= n) {
            sum += i;
            i++;
            System.out.println("i : " + i);
        }
    }
}
