package section1.s1_1;


import java.util.Scanner;

// 입력한 정숫값이 양수인지 음수인지 0인지 판단
public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("양수입니다.");
        }else if(n < 0) {
            System.out.println("음수입니다.");
        }else{
            System.out.println("0입니다.");
        }


    }
}
