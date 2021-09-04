package section2.s2_1;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

/*        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }*/
        System.out.println("역순 정렬을 마쳤습니다.");


        System.out.println("배열의 총 합계 : " + sumOf(x));

    }

    public static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다. ");
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
