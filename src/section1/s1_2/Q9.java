package section1.s1_2;

public class Q9 {
    public static void main(String[] args) {
        // a, b 입력받은후, 그 사이의 정수의 합 구하는 메서드 작성

        System.out.println(sumof(3, 5));


    }

    static int sumof(int a, int b){
        int sum = 0;

        for(int i = a; i <= b; i++){
            sum += i;
            System.out.println(sum);
        }

        return sum;
    }
}
