package section1.s1_2;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            n = sc.nextInt();
        } while (n <= 0);
        npira(n);
    }
    
    // 숫자 피라미드
    public static void npira(int n) {
        for(int i = 1; i <= n; i++){
            // 공백
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // 별
            for(int j = 1; j <= (i-1)*2+1; j++){
                System.out.print(i);
            }
            // 공백
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
