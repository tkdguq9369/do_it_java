package section2.s2_1;

import java.util.Scanner;

// 두 배열이 같은가 판단.
public class ArrayEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 a의 요솟 수: ");
        int na = sc.nextInt();

        int[] a = new int[na];

        for(int i = 0; i < na; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("배열 b의 요솟 수: ");
        int nb = sc.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i < nb; i++){
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }
        copy(a, b);

        System.out.println("배열 a와 b 는 " +
                (equals(a, b) ? "같습니다." : "같지 않습니다."));


        rcopy(a, b);

        for(int i = 0; i < b.length; i++){
            System.out.println("a[" + i + "] b[" + i + "] = " + a[i] + " " + b[i]);
        }


    }

    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    // b배열요소를 a배열요소에 복사
    public static void copy(int[] a, int[] b){
        for(int i = 0; i < b.length; i++){
            a[i] = b[i];
        }
    }

    // b배열 요소를 a배열요소에 역순으로 복사
    public static void rcopy(int[] a, int[] b) {
        for(int i = 0; i < b.length; i++){
            a[i] = b[b.length - i - 1];
        }
    }
}
