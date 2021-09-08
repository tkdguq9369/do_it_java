package section2.s2_1;

import java.util.Scanner;

public class DayOfYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.println("년 : ");
            int year = sc.nextInt(); // 년
            System.out.println("월 : ");
            int month = sc.nextInt(); // 월
            System.out.println("일 : ");
            int day = sc.nextInt(); // 일

            //System.out.printf("그 해 %d일째입니다. \n", dayOfYear(year, month, day));
            System.out.printf("%d일 남았습니다. \n", leftDayOfYear(year, month, day));

            System.out.printf("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }

    //각 달의 일수
    public static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
    };

    // 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
    public static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 수함
    public static int dayOfYear(int y, int m, int d) {
        /*
        int days = d; // 일수
        for(int i = 1; i < m; i++){ // 1월~(m-1)월의 일 수를 더함
            days += mdays[isLeap(y)][i-1];
        }
        return days;
        */

        // Q8. i, days없이 구현
        while (--m != 0) {
            d += mdays[isLeap(y)][m - 1];
        }

        return d;
    }

    // Q9. y년m월d일의 그 해 남은 일 수를 구하는 아래 메서드.
    public static int leftDayOfYear(int y, int m, int d) {
        int days = d;
        while (--m != 0) {
            d += mdays[isLeap(y)][m - 1];
        }

        return 365 + isLeap(y) - days;
    }

}
