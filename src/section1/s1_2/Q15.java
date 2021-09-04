package section1.s1_2;

import java.util.Scanner;

//직각 이등변삼각형
public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("단 수 : ");
            n = sc.nextInt();
        } while (n <= 0);

        //triangleLB(n);
        //triangleLU(n);
        //triangleRU(n);
        triangleRB(n);
    }

    // 왼쪽 위가 직각
    /*
     *  x
     *  x x
     *  x x x
     *  x x x x
     *  x x x x x
     *
     * */
    public static void triangleLB(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 왼쪽 위가 직각
    /*
     *  x x x x x
     *  x x x x
     *  x x x
     *  x x
     *  x
     *
     * */
    public static void triangleLU(int n) {

        // 줄
        for (int i = 1; i <= n; i++) {
            // 별
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 오른쪽 위가 직각
    /*
     *  x x x x x  n 1
     *    x x x x  n 2
     *      x x x  n 3
     *        x x  n 4
     *          x  n 5
     *
     * */
    public static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= n - i + 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    // 오른쪽 아래가 직각
    /*
     *          x
     *        x x
     *      x x x
     *    x x x x
     *  x x x x x
     *
     * */
    public static void triangleRB(int n) {

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n - 1; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
