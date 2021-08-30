package section1.s1_2;

import java.util.Scanner;

public class Q7 {

    //Q7 n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28' 로 출력하는 프로그램 작성

    public static void main(String[] args) {


        int n = 7;

        int sum = 0;

        String ex = "";


        for(int i = 1; i <= n; i++){
            sum += i;

            ex += i;


            if(i == 7) {
                ex += " = " + sum;
            } else {
                ex += " + ";
            }
        }

        System.out.println(ex);

    }
}
