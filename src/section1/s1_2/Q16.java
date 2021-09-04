package section1.s1_2;

import java.util.Scanner;

// n단 피라미드
public class Q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("단 수 : ");
            n = sc.nextInt();
        }while (n <= 0);

        spira(n);

    }

    public static void spira(int n){
        for(int i = 1; i <= n; i++){
            // 공백
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // 별
            for(int j = 1; j <= (i-1)*2+1; j++){
                System.out.print("*");
            }
            // 공백
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
